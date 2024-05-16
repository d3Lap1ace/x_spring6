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
public class Score {
    private Integer c_id;
    private Integer c_number;
    private Integer s_id;
    private Integer u_id;
    private List<Course>courseList;
}
