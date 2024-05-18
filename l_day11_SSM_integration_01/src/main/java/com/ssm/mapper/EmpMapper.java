package com.ssm.mapper;

import com.ssm.pojo.Employee;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 18/5/2024 14:50 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmpMapper {
    List<Employee>queryAll();
}
