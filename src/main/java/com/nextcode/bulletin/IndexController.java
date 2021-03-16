package com.nextcode.bulletin;

import com.nextcode.bulletin.user.domain.UserVO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@EnableAutoConfiguration
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Readre!");
    }

    //    @GetMapping("/login-error")
    @RequestMapping(value = "/sessionValue", method = RequestMethod.GET)
    public void test(Model model, HttpServletRequest request) {
        UserVO userVO= (UserVO) request.getSession().getAttribute("userInfo");
        System.out.println(request.getSession());
        if ( userVO == null ) {
            System.out.println("not logged in");
        } else {
            System.out.println(userVO.toString());
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login() {

    }



}
