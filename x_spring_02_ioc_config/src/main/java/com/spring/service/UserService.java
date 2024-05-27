package com.spring.service;

import com.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 21:14 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class UserService {
    @Autowired
    private User user;

    public void printHooby(){
        System.out.println(user.getHooby());
    }
}
