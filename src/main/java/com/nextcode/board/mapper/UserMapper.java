package com.nextcode.board.mapper;

import com.nextcode.board.user.domain.UserVO;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {
//    public List<Map<String,UserVO>> findUsers();
    @Select("select email,password from user where email like '%${value}%")
    public UserVO getUser(int id);
}
