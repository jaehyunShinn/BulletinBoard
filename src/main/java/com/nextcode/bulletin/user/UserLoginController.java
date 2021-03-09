package com.nextcode.bulletin.user;

import com.nextcode.bulletin.user.domain.UserVO;
import com.nextcode.bulletin.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//returns data rather than view
@RestController
@RequestMapping("/user")
public class UserLoginController  {
    @Autowired
    private UserService userService;

//결론 login.jsp를 연결할 필용는 없음
    @RequestMapping(value="/loginPost",method= {RequestMethod.POST})
    public ModelMap loginPost(@RequestBody UserVO loginDTO, HttpServletRequest request) throws Exception {
        ModelMap model = new ModelMap();
        model.addAttribute("user",loginDTO);
        return model;
    }

// to do
    public int verifyLogin(UserVO user) {
        String SQL ="";
        return 1;
    }

}
