package com.sryzzz.model.vo;

import com.sryzzz.model.domain.Book;
import com.sryzzz.model.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author sryzzz
 * @create 2022/5/17 21:46
 * @description 用户借阅详细信息实体
 */
@Data
@AllArgsConstructor
@ToString
public class UserBorrowDetailVO {

    /**
     * 用户
     */
    private User user;

    /**
     * 借阅书籍列表
     */
    private List<Book> bookList;
}
