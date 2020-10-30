package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.users.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }
    @Test
    void testSelectInfo(){
        Integer stuid=184023030;
        User user=this.userService.selectByPrimaryKey(stuid);
        System.out.println(user);

    }
}
