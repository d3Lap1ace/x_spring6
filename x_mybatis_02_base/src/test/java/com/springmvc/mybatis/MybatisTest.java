package com.springmvc.mybatis;

import com.impower.mybatis.mapper.EmployeeMapper;
import com.impower.mybatis.pojo.Employee;
import com.impower.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 28/5/2024 18:41 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    @Test
    public void test_01(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployee(1);
        System.out.println("employee = " + employee);

    }
}
