package com.spring.xml.ioc02;

import lombok.Data;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 23/5/2024 14:35 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class User {
    private String name;
    private Integer age;
    private String gender;
    private School school;
}
