package com.demo.examSystem;

import com.demo.examSystem.dao.UserDao;
import com.demo.examSystem.entity.User;
import com.demo.examSystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamSystemApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("wangwu");
        user.setPassword("111");
        user.setEmail("111@222.com");
        System.out.println("user:" +user.toString());
       userDao.insert(user);

    }

}
