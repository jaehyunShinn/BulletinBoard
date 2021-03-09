package com.nextcode.bulletin.user;

import com.nextcode.bulletin.sample.domain.SampleDto;
import com.nextcode.bulletin.sample.domain.SampleForm;
import com.nextcode.bulletin.user.domain.UserForm;
import com.nextcode.bulletin.user.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public UserVO verifyIsUser(UserForm userForm);

}
