package com.javaee.springboot.controller;

import com.javaee.springboot.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 19:19 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
public class UserController {
    @RequestMapping("user/list")
    public List<User> list(){
        User user = new User();
        user.setAge(20);
        user.setGender("women");
        user.setName("halis");
        List<User> user1 = List.of(user);
        return user1;
    }
}
