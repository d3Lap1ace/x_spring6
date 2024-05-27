package com.spring.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 21:12 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
@Repository
public class User {
    private Integer id;
    private String name;
    private String hooby;
}
