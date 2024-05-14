package com.javaMybatis.test;

import com.java.mapper.EmployeeMapper;
import com.java.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 15:26 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    @Test
    public void test01() throws IOException {


        // 以输入流的形式加载Mybatis配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 基于读取Mybatis配置文件的输入流创建SqlSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 使用SqlSessionFactory对象开启一个会话
        SqlSession session = sessionFactory.openSession();

        // 根据EmployeeMapper接口的Class对象获取Mapper接口类型的对象(动态代理技术)
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        // 调用代理类方法既可以触发对应的SQL语句
        Employee employee = employeeMapper.selectEmployee(1);

        System.out.println("employee = " + employee);

        session.commit(); //提交事务 [DQL不需要,其他需要]
        session.close(); //关闭会话
    }
}
