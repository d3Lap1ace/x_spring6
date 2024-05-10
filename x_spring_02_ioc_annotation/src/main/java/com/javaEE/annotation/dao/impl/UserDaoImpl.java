package com.javaEE.annotation.dao.impl;

import com.javaEE.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 8:04 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void daoPrint() {
        System.out.println("dao..........");
    }
    public  UserDaoImpl(){
        System.out.println("dao无参构造..............");
    }
}
