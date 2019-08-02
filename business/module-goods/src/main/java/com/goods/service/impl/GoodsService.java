package com.goods.service.impl;

import com.goshop.entity.Goods;
import com.goshop.entity.User;
import com.goods.mapper.IGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService implements com.goods.service.IGoodsService {

//    @Autowired
//    RedisClientTemplate redisClientTemplate;

    @Autowired
    private IGoodsMapper goodsMapper;

    @Override
    public Goods findGoodsById() {
        return goodsMapper.selectGoods(1);
    }
}
