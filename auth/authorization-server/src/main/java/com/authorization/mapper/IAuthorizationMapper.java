package com.authorization.mapper;

import com.goshop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Mapper
public interface IAuthorizationMapper {

    User findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);




}
