package com.sryzzz.borrow.mapper;

import com.sryzzz.model.domain.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: sryzzz
 * @create: 2022/5/13 17:28
 * @description: 借阅 dao 层
 */
@Mapper
public interface BorrowMapper {

    /**
     * 通过用户id查询借阅列表
     *
     * @param uid 用户id
     * @return 用户借阅列表
     */
    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowsByUid(Integer uid);

    /**
     * 通过图书ID查询借阅信息
     *
     * @param bid 图书id
     * @return 图书借阅信息列表
     */
    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowsByBid(Integer bid);

    /**
     * 通过用户id和图书id获取借阅信息
     *
     * @param uid 用户id
     * @param bid 图书id
     * @return 借阅信息
     */
    @Select("select * from db_borrow where bid = #{bid} and uid = #{uid}")
    Borrow getBorrow(Integer uid, Integer bid);
}
