package com.javaee.springboot.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 18:32 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say(){
        return "hello springboot";
    }
}
