package com.mybatisx.mapper;

import com.mybatisx.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/25/2024 9:16 PM Sat
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public interface UserMapper {
    User queryHooby(Integer id);
    User queryById(Integer id);
    int insertUser(User user);
    int deleteByid(Integer id);
    int updateUserByid(Map<String,Object>paramMap);




}
