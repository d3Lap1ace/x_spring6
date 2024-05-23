package com.javaee.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 09:36 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello springboot";
    }
}
