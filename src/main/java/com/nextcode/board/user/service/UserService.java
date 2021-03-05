package com.nextcode.board.user.service;

import com.nextcode.board.user.domain.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(UserVO userVO) throws Exception;
    int login(UserVO userVO) throws Exception;
}
