package com.nextcode.bulletin.user;

import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import com.nextcode.bulletin.user.domain.UserForm;
import com.nextcode.bulletin.user.domain.UserVO;
import com.nextcode.bulletin.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//returns data rather than view
@RestController
@RequestMapping("/user")
public class UserLoginController  {
    @Autowired
    private UserService userService;

//결론 login.jsp를 연결할 필용는 없음
    @RequestMapping(value="/loginPost",method= {RequestMethod.POST})
    public ModelMap loginPost(@RequestBody UserForm userForm, HttpServletRequest request) throws Exception {
        ModelMap model = new ModelMap();
        UserVO userVO = fetchUser(userForm);
        if ( userVO == null ) {

            model.addAttribute("resultCode",200);
            request.getSession().setAttribute("userInfo",userForm);
//       세션에 넣어야할 것은 Serializeable한 dto클래스를 넣어야지
        } else {

            model.addAttribute("resultCode",400);
        }
        return model;
    }

    private UserVO fetchUser(UserForm userForm) {
        return userService.verifyIsUser(userForm);
    }

//    @RequestMapping("/user")
//    public void getUser(UserForm form, HttpServletRequest request, Model model){
//
//        List<UserVO> userList = userService.verifyIsUser(form) ;
//
//        model.addAttribute("list", userList);
//
//
//    }

}
