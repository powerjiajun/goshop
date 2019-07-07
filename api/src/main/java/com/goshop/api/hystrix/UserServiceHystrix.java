package com.goshop.api.hystrix;

import com.goshop.api.rpc.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUserService {
    @Override
    public String findUserInfo() {
        return "hystrix findUserInfo";
    }
}
