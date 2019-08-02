package com.goshop.api.rpc;

import com.goshop.api.fallback.GoodsServiceFallback;
import com.goshop.api.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "module-goods", fallback = GoodsServiceFallback.class)
public interface IGoodsService {
    @RequestMapping(value = "/findGoodsInfo")
    String findGoodsInfo();


}
