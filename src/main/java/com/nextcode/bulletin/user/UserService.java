package com.nextcode.bulletin.user;

import com.nextcode.bulletin.user.domain.UserForm;
import com.nextcode.bulletin.user.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserVO verifyIsUser(UserForm form) {
        return userMapper.verifyIsUser(form);
    }


}
