package com.goshop.api.fallback;

import com.goshop.api.rpc.IGoodsService;
import org.springframework.stereotype.Component;

@Component
public class GoodsServiceFallback implements IGoodsService {


    public String findGoodsInfo() {
        return "findGoodsById fallback";
    }
}
