package com.goods.controller;

import com.goshop.entity.Goods;
import com.goshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private com.goods.service.IGoodsService goodsService;

    @RequestMapping("/findGoodsInfo")
    public String findGoodsInfo() {
        Goods goods = goodsService.findGoodsById();
        return goods.getName();
    }

}
