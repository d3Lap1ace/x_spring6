package com.springmvc.mybatis;

import com.springmvc.mybatis.Utils.SqlSessionUtils;
import com.springmvc.mybatis.mapper.EmpMapper;
import com.springmvc.mybatis.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:59 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    @Test
    public void test_01() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Employee employee = new Employee();
        employee.setName("lucas");
        employee.setSalary(992.0);
        int rows = mapper.insertUser(employee);
        System.out.println("rows = " + rows);
        SqlSessionUtils.closeSession(sqlSession);
    }

    @Test
    public void test_02() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        int rows = mapper.deleteById(3);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }

    @Test
    public void test_03() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("yinaifa");
        employee.setSalary(250.0);
        int rows = mapper.updateUser(employee);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }

    @Test
    public void test_04() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Employee employee = mapper.queryById(2);


        System.out.println("user = " + employee);
        sqlSession.close();
    }

    @Test
    public void test_05(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Employee> employeeList = mapper.getUserList();
        employeeList.forEach(System.out::println);
        sqlSession.close();
    }










}
