package com.goshop.api.rest;

import com.goshop.api.rpc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserRest {

    @Autowired
    IUserService userService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/findUserInfo")
    public String findUserInfo() {
        return userService.findUserInfo();
    }

    @RequestMapping("/consumer")
    public String consumer() {
        kafkaTemplate.send("my-replicated-topic", "hello");
        return "ddd";
    }

}
