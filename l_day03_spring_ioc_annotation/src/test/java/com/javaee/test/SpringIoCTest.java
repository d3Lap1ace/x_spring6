package com.javaee.test;

import com.javaee.ioc_02.UserService;
import com.javaee.ioc_03.UserDao;
import com.javaee.ioc_03.UserServiceImpl;
import com.javaee.ioc_04.SoldierController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 18:15 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringIoCTest {
    @Test
    public void test_01(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_01.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Arrays.toString(beanDefinitionNames)="+ Arrays.toString(beanDefinitionNames));
    }
    @Test
    public void test_02(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_02.xml");
        UserServiceImpl userService = ac.getBean(UserServiceImpl.class);
        UserDao userDao = ac.getBean("userDaoImpl2", UserDao.class);
        System.out.println(userService.eq(userDao));
        userService.usersay(userDao);
    }
    @Test
    public void test_03(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_03.xml");
        SoldierController soldierController = ac.getBean(SoldierController.class);
        soldierController.getMessage();
        soldierController.getValue();
    }
}
