package com.springmvc.controller;

import com.springmvc.pojo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 13/5/2024 16:24 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping ("login")
    public String login(){
        System.out.println("UserController.login");
        String str = null;
        str.toString();
        return str;
    }
    @GetMapping("regist")
    public String regist(){
        System.out.println("UserController.regist");
        int i = 1/0;
        return "regist";
    }
    @RequestMapping("show")
    public User show(@Validated @RequestBody User user){
        System.out.println("UserController.show");
        System.out.println("user = " + user);
        return user;
    }
    @RequestMapping("show/xxx")
    public String xxx(){
        System.out.println("UserController.xxx");
        return "xxx";
    }
    @RequestMapping("remove")
    public String remove(){
        System.out.println("UserController.remove");
        return "remove";
    }


}
