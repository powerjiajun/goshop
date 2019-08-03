package com.goshop.api.rest;

import com.goshop.api.rpc.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsRest {
    @Value("${name}")
    private String name;

    @Autowired
    IGoodsService goodsService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/findGoodsInfo")
    public String findUserInfo() {
        return goodsService.findGoodsInfo() + "||" + name;
    }


}
