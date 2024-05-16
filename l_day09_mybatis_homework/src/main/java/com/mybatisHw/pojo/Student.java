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
public class Student {
    private Integer s_id;
    private String s_name;
    private Integer a_id;
    private List<Score>scoreList;
    private List<Address>addressList;
    private List<Score>scoreAndcourseList;
    private List<Score>all;

}
