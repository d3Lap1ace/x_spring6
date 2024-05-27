package com.javaee.ioc_03;

import org.springframework.stereotype.Repository;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 18:28 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository
public class UserDaoImpl2 implements UserDao{
    @Override
    public void say() {
        System.out.println("UserDaoImpl2.say");
    }
}
