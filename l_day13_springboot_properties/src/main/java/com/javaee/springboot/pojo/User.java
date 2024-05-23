package com.javaee.springboot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 10:51 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
@Component
@ConfigurationProperties(prefix ="my.user")
public class User {
//    @Value("${my.user.age}")
    private int age;

//    @Value("${my.user.name}")
    private String name;

//    @Value("${my.user.gender}")
    private String gender;
}
