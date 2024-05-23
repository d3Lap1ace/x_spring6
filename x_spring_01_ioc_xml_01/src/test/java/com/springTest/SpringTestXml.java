package com.springTest;

import com.spring.xml.ioc01.HelloXml;
import com.spring.xml.ioc02.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 23/5/2024 14:27 周四
 * @description
 * @Version 1.0
 *
 * 为什么执行test_02 会调用test_01里面的组件的无参构造?
 * From the Laplace Demon
 */


public class SpringTestXml {
    @Test
    public void test_01(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("springIoc01.xml");
        HelloXml helloXml = ca.getBean("helloXml", HelloXml.class);
        helloXml.say();
    }
    @Test
    public void test_02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("springIoc01.xml");
        User user = ac.getBean(User.class,"user");
        System.out.println("user = " + user);
    }

    @Test
    public void test_03() throws SQLException {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springIOc01.xml");
        DataSource dataSource = classPathXmlApplicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);

    }

}
