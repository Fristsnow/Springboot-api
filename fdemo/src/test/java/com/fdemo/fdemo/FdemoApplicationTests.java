package com.fdemo.fdemo;

import com.fdemo.fdemo.mapper.UserMapper;
import com.fdemo.fdemo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(6);
        user.setName("Tome");
        userMapper.update(user);
    }
}
