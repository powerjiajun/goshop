package com.goshop.api.rest;

import com.goshop.api.rpc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {
    @Value("${name}")
    private String name;

    @Autowired
    IUserService userService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/findUserInfo")
    public String findUserInfo() {
        return userService.findUserInfo() + "||" + name;
    }

    @RequestMapping("/consumer")
    public String consumer() {
        kafkaTemplate.send("test3", "hello");
        return "ddd";
    }

}
