package com.nextcode.board.user.service;

import com.nextcode.board.user.domain.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    // private UserDAO userDAO;

    @Override
    public void register(UserVO userVO) throws Exception {

       //userDAO.register(userVO);
    }
    //select 문으로 -> MyBatis
    @Override
    public int login(UserVO userVO) throws Exception {
//        userDAO.login(userVO);
//        return userVO;
        String SQL = "SELECT userPW FROM dbo.[USER] where userID = ?";
        try {


        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }


}
