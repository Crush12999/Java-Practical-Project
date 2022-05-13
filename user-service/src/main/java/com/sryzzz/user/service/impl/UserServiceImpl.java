package com.sryzzz.user.service.impl;

import com.sryzzz.user.mapper.UserMapper;
import com.sryzzz.user.model.domain.User;
import com.sryzzz.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:40
 * @description: 用户业务处理层实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 通过id查找用户
     *
     * @param uid 用户id
     * @return 用户实例
     */
    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
