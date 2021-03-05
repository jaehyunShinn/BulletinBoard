package com.nextcode.board;

import com.nextcode.board.user.domain.UserVO;
import com.nextcode.board.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
//returns data rather than view
@RestController
@RequestMapping("/user")
public class UserLoginController extends HttpServlet {
    @Autowired
    private UserServiceImpl userServiceImpl;
//결론 login.jsp를 연결할 필용는 없음
    @RequestMapping(value="/loginPost",method= {RequestMethod.POST})
    public ModelMap loginPost(@RequestBody UserVO loginDTO, HttpServletRequest request, HttpSession httpSession) throws Exception {
//        model.addAttribute("loginError", true);
        /*
        1. 세션을 해시테이블에 등록
        2. 할당된 고유의 세션 값을 key로, id를 값으로 하여 해쉬테이블에 등록
         */
        //login 이후에 세션이 만들어짐
            System.out.println(loginDTO.toString());
            httpSession = request.getSession();
            if ( loginDTO.getEmail() == null  && loginDTO.getPassword() == null ) {
                return null;
            } else {
                int successLoginFlag = userServiceImpl.login(loginDTO);
                if (successLoginFlag == 1 ) {
                    //session을 만들어야 해
    //                httpSession.setAttribute("email",loginDTO.getEmail());
    //                httpSession.setAttribute("password",loginDTO.getPassword();
                    httpSession.setAttribute("userInfo",loginDTO);
                }
            }
//        int successLoginFlag = userServiceImpl.login(loginDTO);
//        if (successLoginFlag ==1 ) {
//            //session을 만들어야 해
//            httpSession.setAttribute("email",loginDTO.getEmail());
//            httpSession.setAttribute("password",loginDTO.getPassword();
//
//        }
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
