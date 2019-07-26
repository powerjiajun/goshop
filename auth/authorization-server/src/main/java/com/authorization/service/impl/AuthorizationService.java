package com.authorization.service.impl;

import com.authorization.mapper.IAuthorizationMapper;
import com.authorization.service.IAuthorizationService;
import com.goshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService implements IAuthorizationService {

    @Autowired
    private IAuthorizationMapper authMapper;

    @Override
    public User login(String username, String password) {
        User user = authMapper.findByUsernameAndPwd(username, password);
        return user;
    }
}
