package com.sryzzz.book.service.impl;

import com.sryzzz.book.mapper.BookMapper;
import com.sryzzz.book.model.domain.Book;
import com.sryzzz.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:46
 * @description: 书籍业务处理层实现
 */

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    /**
     * 通过书籍 id 获取书籍实例
     *
     * @param bid 书籍id
     * @return 书籍实例
     */
    @Override
    public Book getBookById(Integer bid) {
        return bookMapper.getBookById(bid);
    }
}
