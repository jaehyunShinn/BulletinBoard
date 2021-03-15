package com.nextcode.bulletin.user;

import com.nextcode.bulletin.board.domain.BoardVO;
import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import com.nextcode.bulletin.user.domain.UserForm;
import com.nextcode.bulletin.user.domain.UserVO;
import com.nextcode.bulletin.user.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Logger;

//returns data rather than view
@RestController
@Scope("session")
@RequestMapping("/user")
public class UserLoginController {
    @Autowired
    private UserService userService;

    //결론 login.jsp를 연결할 필용는 없음
    @RequestMapping(value = "/loginPost", method = {RequestMethod.POST})
    public ModelMap loginPost(@RequestBody UserForm userForm, HttpServletRequest request) throws Exception {
        ModelMap model = new ModelMap();
        if(userForm.getPassword()== null && userForm.getEmail()==null) {
            model.addAttribute("errorCode",400);
        }
        System.out.println(userForm.toString());
        // userForm 에러
        UserVO userVO = fetchUser(userForm);

        if (userVO == null) {
            // 로그인 실패, 가입안된 회원

            model.addAttribute("resultCode", 406);
//            request.getSession().setAttribute("usernIfo",userVO);
//       세션에 넣어야할 것은 Serializeable한 dto클래스를 넣어야지
        } else {

            System.out.println("userVo password" + userVO.getPassword());
            //빈문자열 ->string or object?
            if (StringUtils.equals(userVO.getPassword(), userForm.getPassword())) {
                model.addAttribute("resultCode", 200);
                userVO.setPassword(null);
                //session 등록 전에
                request.getSession().setAttribute("userInfo", userVO);
            } else {
                //비밀번호가 틀렸음
                model.addAttribute("resultCode", 410);
            }
            //로그인 성공
//            HttpServletRequest response= getSes
            // request.getRequestDispatcher("index").forward(request,httpServletResponse);
        }
        return model;
    }
    private UserVO fetchUser(UserForm userForm) {
        return userService.verifyIsUser(userForm);
    }
//    @RequestMapping("/user")
//    public void getUser(UserForm form, HttpServletRequest request, Model model){
//        List<UserVO> userList = userService.verifyIsUser(form) ;
//        model.addAttribute("list", userList);
//    }

}
