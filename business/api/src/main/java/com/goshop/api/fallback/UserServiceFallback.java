package com.goshop.api.fallback;

import com.goshop.api.rpc.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements IUserService {
    @Override
    public String findUserInfo() {
        return "fallback findUserInfo";
    }
}
