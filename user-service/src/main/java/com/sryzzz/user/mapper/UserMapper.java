package com.sryzzz.user.mapper;

import com.sryzzz.user.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:40
 * @description: 用户 dao 层
 */
@Mapper
public interface UserMapper {

    /**
     * 通过id查询用户
     * @param uid 用户 id
     * @return 用户实例
     */
    @Select("select * from DB_USER where uid = #{uid}")
    User getUserById(int uid);
}
