package com.javaEE.annotation.controller;
import com.javaEE.annotation.service.UserService;
import com.javaEE.annotation.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 8:08 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
public class UserController {

    private UserService userService;


    public  UserController( @Autowired UserService userService) {
        this.userService = userService;
        System.out.println("controller无参构造...........");
    }

    public void controllerPrint() {
        userService.servicePrint();
        System.out.println("Controller............");
    }
}
