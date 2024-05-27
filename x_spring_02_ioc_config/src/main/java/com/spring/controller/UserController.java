package com.spring.controller;

import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 21:16 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void hooby(){
        userService.printHooby();
    }
}
