package com.sryzzz.model.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:46
 * @description: 书籍实体类
 */

@Data
@ToString
public class Book {

    /**
     * 图书 ID
     */
    private int bid;

    /**
     * 图书名
     */
    private String title;

    /**
     * 图书描述
     */
    private String desc;
}
