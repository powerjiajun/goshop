package com.authorization.rest;

import com.authorization.service.IAuthorizationService;
import com.goshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AuthorizationController {

    @Autowired
    private IAuthorizationService authService;


    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = authService.login(username, password);
        if (user == null) {
            return "loginFail";
        }

        return "loginSuccess";
    }

}
