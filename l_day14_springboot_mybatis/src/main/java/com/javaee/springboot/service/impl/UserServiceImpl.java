package com.javaee.springboot.service.impl;

import com.javaee.springboot.mapper.UserMapper;
import com.javaee.springboot.pojo.User;
import com.javaee.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 20:28 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        int rows = userMapper.insertUser(user);
        return rows > 0;
    }

}
