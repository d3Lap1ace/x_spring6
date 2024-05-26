package com.mybatisx.mapper;

import com.mybatisx.pojo.User;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/25/2024 9:16 PM Sat
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public interface UserMapper {
    List<User> queryScore();
    User queryById(Integer id);
    int insertUser(User user);
    int deleteUser(User user);
    int updataUser(User user);
}
