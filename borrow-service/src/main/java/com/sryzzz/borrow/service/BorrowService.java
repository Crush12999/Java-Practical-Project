package com.sryzzz.borrow.service;

import com.sryzzz.model.vo.UserBorrowDetailVO;

/**
 * @author: sryzzz
 * @create: 2022/5/13 17:34
 * @description: 借阅服务业务处理层
 */

public interface BorrowService {

    /**
     * 查询用户所借阅的图书
     *
     * @param uid 用户id
     * @return 借阅图书列表
     */
    UserBorrowDetailVO getUserBorrowDetailByUid(Integer uid);
}
