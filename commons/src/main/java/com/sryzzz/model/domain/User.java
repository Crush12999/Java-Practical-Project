package com.sryzzz.model.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:40
 * @description: 用户实体类
 */

@Data
@ToString
public class User {

    /**
     * 用户 ID
     */
    private int uid;

    /**
     * 用户名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;
}
