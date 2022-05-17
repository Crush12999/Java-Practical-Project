package com.sryzzz.user.service;

import com.sryzzz.model.domain.User;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:40
 * @description: 用户业务处理层
 */

public interface UserService {

    /**
     * 通过id查找用户
     *
     * @param uid 用户id
     * @return 用户实例
     */
    User getUserById(Integer uid);
}
