package com.javaee.dao.impl;

import com.javaee.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 21:28 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Dao exe........");
    }
}
