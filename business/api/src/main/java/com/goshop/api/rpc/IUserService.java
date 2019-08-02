package com.goshop.api.rpc;

import com.goshop.api.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "module-user", fallback = UserServiceFallback.class)
public interface IUserService {

    @RequestMapping(value = "/findUserInfo")
    String findUserInfo();

}
