package com.javaee.springboot.pojo;

import lombok.Data;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 20:20 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}
