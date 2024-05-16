package com.mybatisHw.mapper;

import com.mybatisHw.pojo.Student;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 16:24 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface StudentMapper {

    List<Student> queryStScore();

    List<Student> queryStAddress();

    List<Student> queryScoreAndCourse();

    List<Student> all();
}
