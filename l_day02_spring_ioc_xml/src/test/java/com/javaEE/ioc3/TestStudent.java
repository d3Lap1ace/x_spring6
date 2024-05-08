package com.javaEE.ioc3;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/3/2024 1:59 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class TestStudent {

    @Test
    public void test01() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_03.xml");
        Student student = ac.getBean("studentOne", Student.class);
        System.out.println(student);

        Student studentTwo = ac.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);

        Student studentThree = ac.getBean("studentThree", Student.class);
        System.out.println(studentThree);

        Student studentFour = ac.getBean("studentFour", Student.class);
        System.out.println(studentFour);

        Student studentFive = ac.getBean("studentFive", Student.class);
        System.out.println(studentFive);

        Student studentSix = ac.getBean("studentSix", Student.class);
        System.out.println(studentSix);

        Student setname1 = ac.getBean("setname", Student.class);
        System.out.println("setname1 = " + setname1);

        DataSource dataSource = ac.getBean("druidDataSource", DruidDataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }

}
