package com.javaee.ioc;

import com.javaee.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 21:10 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        StudentController studentController = ac.getBean(StudentController.class);
        studentController.findAll();

    }
}
