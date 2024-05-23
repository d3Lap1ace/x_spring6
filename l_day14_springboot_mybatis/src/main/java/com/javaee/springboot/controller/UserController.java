package com.javaee.springboot.controller;

import com.javaee.springboot.pojo.User;
import com.javaee.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 20:48 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
//    @RequestMapping("get")
//    public User getUser(){
//        User user = userService.getUser(1);
//        return user;
//    }
    @RequestMapping("save")
    public String savaUser(User user){
        boolean is = userService.insertUser(user);

        return is?"success":"fail";
    }
}

