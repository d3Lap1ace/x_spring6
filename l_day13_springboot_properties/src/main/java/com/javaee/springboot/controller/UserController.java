package com.javaee.springboot.controller;

import com.javaee.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 10:53 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
public class UserController {
    @Autowired
    private User user;

    @RequestMapping(path = "/hello")
    public User sqyhello(){
        System.out.println("hello");
        System.out.println("user = " + user);
        return user  ;
    }
}
