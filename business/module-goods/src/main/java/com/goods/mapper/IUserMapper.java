package com.goshop.goods.mapper;

import com.goshop.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectUser(int id);

}
