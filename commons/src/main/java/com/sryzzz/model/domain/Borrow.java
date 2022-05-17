package com.sryzzz.model.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author: sryzzz
 * @create: 2022/5/13 17:26
 * @description: 借阅实体类
 */
@Data
@ToString
public class Borrow {

    /**
     * 主键 ID
     */
    private int id;

    /**
     * 用户 ID
     */
    private int uid;

    /**
     * 图书 ID
     */
    private int bid;
}
