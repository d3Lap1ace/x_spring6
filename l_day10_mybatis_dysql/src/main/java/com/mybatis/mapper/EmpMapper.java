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
    //无条件的分页

    List<Employee> queryAll();


    //第一组动态标签 if + where
    //传入员工的姓名或者员工的工资,可能不传入
    List<Employee> queryByParam(@Param("empName") String empName, @Param("empSalary") Double empSalary);

    //第二组动态标签 if + set
    //根据id更新员工数据,传入一个员工对象,如果传入name或者salary属性为null不需要更新!
    int updateEmpById(Employee employee);

    //第三组动态标签 choose = when = otherwise
    //查询员工的数据,有员工名,就更名称查询,如果没有名称有工资,根据工资查询,如果都没有查询全部
    List<Employee> queryByChoose(@Param("empName") String empName, @Param("empSalary") Double empSalary);


    //第四组动态标签 foreach 遍历标签  处理传入的集合或者数组参数
    //根据id进行批量数据查询 id = 1  [1,2,3,4]
    List<Employee> queryByIds(@Param("ids") List<Integer> ids);
    //根据id进行批量数据删除
    int deleteByIds(@Param("ids") List<Integer> ids);
    //批量数据插入
    int batchInsert(@Param("emps")List<Employee> emps);
    //批量数据更新
    int batchUpdate(@Param("emps")List<Employee> emps);


}
