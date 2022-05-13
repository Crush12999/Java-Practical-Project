package com.sryzzz.book.mapper;

import com.sryzzz.book.model.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:52
 * @description:
 */

@Mapper
public interface BookMapper {

    /**
     * 通过书籍 id 获取书籍实例
     *
     * @param bid 书籍id
     * @return 书籍实例
     */
    @Select("select * from DB_BOOK where bid = #{bid}")
    Book getBookById(Integer bid);
}
