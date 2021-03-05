package com.nextcode.board.model.network;

import com.nextcode.board.user.domain.UserVO;


public interface UserDAO {

    void register(UserVO userVO) throws Exception;

     void login(UserVO userVO) throws Exception;

}
