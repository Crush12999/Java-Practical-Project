package com.sryzzz.borrow.service.impl;

import com.sryzzz.borrow.mapper.BorrowMapper;
import com.sryzzz.borrow.service.BorrowService;
import com.sryzzz.model.domain.Book;
import com.sryzzz.model.domain.Borrow;
import com.sryzzz.model.domain.User;
import com.sryzzz.model.vo.UserBorrowDetailVO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: sryzzz
 * @create: 2022/5/13 17:34
 * @description: 借阅服务业务处理层实现
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private BorrowMapper borrowMapper;

    /**
     * 查询用户所借阅的图书
     *
     * @param uid 用户id
     * @return 借阅图书列表
     */
    @Override
    public UserBorrowDetailVO getUserBorrowDetailByUid(Integer uid) {
        List<Borrow> borrows = borrowMapper.getBorrowsByUid(uid);
        // RestTemplate支持多种方式的远程调用
        RestTemplate template = new RestTemplate();
        // 这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        // 获取User信息
        User user = template.getForObject("http://localhost:11103/user/"+uid, User.class);
        // 获取每一本书的详细信息
        List<Book> bookList = borrows
                .stream()
                .map(b -> template.getForObject("http://localhost:11101/book/"+b.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetailVO(user, bookList);
    }
}
