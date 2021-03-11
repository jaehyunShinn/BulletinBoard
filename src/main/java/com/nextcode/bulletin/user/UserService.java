package com.nextcode.bulletin.user;

import com.nextcode.bulletin.user.domain.UserForm;
import com.nextcode.bulletin.user.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserVO verifyIsUser(UserForm userForm) {

        return userMapper.verifyIsUser(userForm);
    }


}