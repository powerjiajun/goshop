package com.goshop.goods.service.impl;

import com.goshop.entity.User;
import com.goshop.goods.cache.RedisClientTemplate;
import com.goshop.goods.mapper.IUserMapper;
import com.goshop.goods.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

//    @Autowired
//    RedisClientTemplate redisClientTemplate;

    @Autowired
    private IUserMapper userMapper;

    @Override
    public User findUserById() {
        return userMapper.selectUser(1);
    }
}
