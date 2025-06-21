package com.xing;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xing.model.User;
import com.xing.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestBootApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        Long id = 1L;
        User user = userService.getUserById(id);
        System.out.println(user);
    }
    @Test
    void testPage() {
        int current = 2;
        int size = 3;
        IPage<User> userIPage = userService.selectPage(current, size);
        System.out.println(userIPage.getRecords());
        System.out.println(userIPage.getCurrent());
        System.out.println(userIPage.getSize());
        System.out.println(userIPage.getTotal());
    }

}
