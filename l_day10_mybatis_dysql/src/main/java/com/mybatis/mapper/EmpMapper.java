package com.mybatis.mapper;

import com.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 17/5/2024 11:49 周五
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface EmpMapper {
    List<Employee> queryByParam(@Param("empName") String empName, @Param("empSalary") Double empSalary);
    int updateEmpById(Employee employee);
    List<Employee> queryByChoose(@Param("empName") String empName, @Param("empSalary") Double empSalary);


    List<Employee>queryById(@Param("ids") List<Integer> ids);


}
