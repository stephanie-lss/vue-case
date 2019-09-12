package com.cqupt.test;

import com.cqupt.domain.User;
import com.cqupt.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Lisheng in 11:20 2019/9/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() {
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindById() {
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser() {
        User user = userService.findById(1);
        System.out.println("修改之前的用户：" + user);
        user.setUsername("嘻嘻嘻");
        user.setSex("女");
        userService.updateUser(user);
        System.out.println("修改之后的用户：" + user);
    }
}
