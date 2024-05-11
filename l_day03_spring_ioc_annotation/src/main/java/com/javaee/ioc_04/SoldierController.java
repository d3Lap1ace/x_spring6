package com.javaee.ioc_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 19:26 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller(value = "controlDog")
public class SoldierController {

    @Autowired
    private SoldierService soldierService;

    @Autowired
    public void getValue(){
        System.out.println("-----");
    }
    public void getMessage(){
        soldierService.getMessage();
    }
}
