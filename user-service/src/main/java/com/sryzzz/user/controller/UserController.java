package com.sryzzz.user.controller;

import com.sryzzz.user.model.domain.User;
import com.sryzzz.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: sryzzz
 * @create: 2022/5/12 16:40
 * @description: 用户接口控制层
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        return userService.getUserById(uid);
    }
}
