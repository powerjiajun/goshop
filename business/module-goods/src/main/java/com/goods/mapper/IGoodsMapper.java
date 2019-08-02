package com.goods.mapper;

import com.goshop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IGoodsMapper {

    Goods selectGoods(@Param("id") int id);

}
