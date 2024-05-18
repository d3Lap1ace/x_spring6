package com.ssm.service;

import com.ssm.pojo.Employee;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 18/5/2024 11:45 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmpService {
    List<Employee> findAll();
}
