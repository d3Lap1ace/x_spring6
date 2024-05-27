package com.javaee.ioc_04;

import org.springframework.stereotype.Repository;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 19:23 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository(value = "daoDog")
public class SoldierDao {
    public void getMessage(){
        System.out.println("i am a soidier");
    }
}
