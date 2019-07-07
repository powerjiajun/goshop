package com.goshop.user.service.impl;

import com.goshop.entity.User;
import com.goshop.user.mapper.IUserMapper;
import com.goshop.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {


    @Autowired
    private IUserMapper userMapper;

    @Override
    public User findUserById() {
        return userMapper.selectUser(1);
    }
}
