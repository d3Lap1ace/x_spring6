package com.springmvc.mybatis.mapper;

import com.springmvc.mybatis.pojo.Employee;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 09:04 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmpMapper {
    Employee queryById(Integer id);

    int deleteById(Integer id);

    int insertUser(Employee employee);

    int updateUser(Employee employee);

    List<Employee> getUserList();



}
