package com.sryzzz.book.controller;

import com.sryzzz.book.model.domain.Book;
import com.sryzzz.book.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:45
 * @description: 书籍接口控制层
 */

@RestController
@RequestMapping("book")
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/{bid}")
    Book findBookById(@PathVariable("bid") Integer bid){
        return bookService.getBookById(bid);
    }
}
