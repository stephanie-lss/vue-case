package com.cqupt.service;

import com.cqupt.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Lisheng in 11:15 2019/9/12
 */
public interface IUserService {
    List<User> findAll();

    User findById(Integer id);

    void updateUser(User user);

}
