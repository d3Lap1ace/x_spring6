package com.javaEE;

import com.javaEE.ioc4.UserDao;
import com.javaEE.ioc4.UserDaoFactoryBean;
import com.javaEE.ioc6.Order;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 15:35 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_04.xml");

        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        UserDao userDao1 = applicationContext.getBean(UserDao.class);

        UserDaoFactoryBean userDaoFactoryBean = applicationContext.getBean(UserDaoFactoryBean.class);
        UserDaoFactoryBean userDaoFactoryBean1 = applicationContext.getBean("&userDao", UserDaoFactoryBean.class);

        System.out.println(userDao == userDao1);
        System.out.println(userDaoFactoryBean1 == userDaoFactoryBean);
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_04.xml");

        com.javaEE.ioc5.UserDao userDao1 = applicationContext.getBean("userDao1", com.javaEE.ioc5.UserDao.class);
        com.javaEE.ioc5.UserDao userDao = applicationContext.getBean(com.javaEE.ioc5.UserDao.class);

        System.out.println(userDao == userDao1);
    }
    @Test
    public void test03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring_04.xml");
        Order bean = classPathXmlApplicationContext.getBean(Order.class);
        System.out.println("bean = " + bean);

        classPathXmlApplicationContext.close();
    }
}
