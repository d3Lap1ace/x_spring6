package com.mybatisHw.pojo;

import lombok.Data;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 16:25 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class Course {
    private Integer u_id;
    private String u_name;
    private List<Score>scoreList;
}
