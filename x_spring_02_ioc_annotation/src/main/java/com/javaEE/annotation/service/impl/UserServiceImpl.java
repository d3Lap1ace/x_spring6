package com.javaEE.annotation.service.impl;

import com.javaEE.annotation.dao.UserDao;
import com.javaEE.annotation.dao.impl.UserDaoImpl;
import com.javaEE.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 8:06 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public  UserServiceImpl( UserDao userDao){
        this.userDao = userDao;
        System.out.println("service无参构造................");
    }

    @Override
    public void servicePrint() {
        userDao.daoPrint();
        System.out.println("service........");
    }
}
