package com.goshop.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping("/findUserInfo")
    public String findUserInfo() {
        return "hello ，this is first messge";
    }

}
