package com.javaee.ioc_03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 18:28 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class UserServiceImpl {
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;


    public boolean eq(UserDao userDao){
        return userDao == this.userDao;
    }
}
