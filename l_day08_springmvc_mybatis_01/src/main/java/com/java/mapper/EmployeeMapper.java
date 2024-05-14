package com.java.mapper;

import com.java.pojo.Employee;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 15:17 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmployeeMapper {
    Employee selectEmployee(Integer empId);

    int deleteById(Integer id);
}
