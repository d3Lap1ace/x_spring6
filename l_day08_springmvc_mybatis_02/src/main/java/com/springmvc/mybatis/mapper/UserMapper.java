package com.springmvc.mybatis.mapper;

import com.springmvc.mybatis.pojo.User;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:26 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface UserMapper {
    User queryById(Integer id);

    int deleteById(Integer id);

    int insertUser(User user);

    int updateUser(User user);
}
