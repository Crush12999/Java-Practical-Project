package com.sryzzz.book.service;

import com.sryzzz.model.domain.Book;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:46
 * @description: 书籍业务处理层
 */

public interface BookService {

    /**
     * 通过书籍 id 获取书籍实例
     *
     * @param bid 书籍id
     * @return 书籍实例
     */
    Book getBookById(Integer bid);
}
