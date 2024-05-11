package com.javaeeTest;

import com.javaEE.ioc1.HelloWorld;
import com.javaEE.ioc2.Student;
import com.javaEE.ioc3.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 7:15 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringXmlTest {
    @Test
    public void test_01(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloworld = ac.getBean("helloworld", HelloWorld.class);
        helloworld.say();
    }
    @Test
    public void test_02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Student studentOne = ac.getBean("studentone", Student.class);
        System.out.println(studentOne);
    }
    @Test
    public void test_03(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Student studenttwo = ac.getBean("studenttwo", Student.class);
        System.out.println(studenttwo);

    }
    @Test
    public void test_04(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("springIoc3.xml");
        User bean = ac.getBean(User.class);
        bean.initMethod();
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        bean.destroyMethod();
        ac.close();
    }




}
