package com.cqupt.dao;


import com.cqupt.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lisheng in 11:10 2019/9/12
 */

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id = #{id}")
    void updateUser(User user);

}
