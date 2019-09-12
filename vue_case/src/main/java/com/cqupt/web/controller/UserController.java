package com.cqupt.web.controller;

import com.cqupt.domain.User;
import com.cqupt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LiSheng
 * @date 2019/9/12 12:47
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("test....");
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(Integer userid){
        return userService.findById(userid);
    }

    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println(user);
        userService.updateUser(user);
    }
}
