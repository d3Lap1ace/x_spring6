package com.javaee.dao;

import com.javaee.pojo.Student;

import java.util.List;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 20:14 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface StudentDao {
    List<Student> queryALl();
}
