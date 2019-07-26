package com.authorization.service;

import com.goshop.entity.User;

/**
 * 授权
 */
public interface IAuthorizationService {

    public User login(String username, String password);

}
