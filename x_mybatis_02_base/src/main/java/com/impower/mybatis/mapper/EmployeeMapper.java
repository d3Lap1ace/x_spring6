package com.impower.mybatis.mapper;

import com.impower.mybatis.pojo.Employee;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 28/5/2024 18:35 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmployeeMapper {
    Employee selectEmployee(Integer empId);
}
