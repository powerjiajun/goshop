package com.goshop.user.controller;

import com.goshop.entity.User;
import com.goshop.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findUserInfo")
    public String findUserInfo() {
        User user = userService.findUserById();
        return user.getName();
    }

}
