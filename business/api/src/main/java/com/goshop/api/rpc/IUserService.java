package com.goshop.api.rpc;

import com.goshop.api.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "module-user", fallback = UserServiceHystrix.class)
public interface IUserService {

    @RequestMapping(value = "/findUserInfo")
    String findUserInfo();

}
