package com.sryzzz.borrow.controller;

import com.sryzzz.borrow.service.BorrowService;
import com.sryzzz.model.vo.UserBorrowDetailVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sryzzz
 * @create 2022/5/17 22:18
 * @description 借阅服务接口
 */
@RestController
@RequestMapping("borrow")
public class BorrowController {

    @Resource
    private BorrowService borrowService;

    /**
     * 查询用户所借阅的图书
     *
     * @param uid 用户id
     * @return 借阅图书列表
     */
    @RequestMapping("/{uid}")
    UserBorrowDetailVO findUserBorrows(@PathVariable("uid") Integer uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }

}
