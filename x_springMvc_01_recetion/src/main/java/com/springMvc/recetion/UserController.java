package com.springMvc.recetion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 23/5/2024 17:11 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("show")
    public String show(){
        System.out.println("UserController.show");
        return "show success!";
    }
    @PostMapping("login")
    public String login(){
        System.out.println("UserController.login");
        return "login success!";
    }
    @GetMapping("register")
    public String register(){
        System.out.println("UserController.register");
        return "register success!";
    }}
