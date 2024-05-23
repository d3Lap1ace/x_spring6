package com.javaee.annotation;

import com.javaEE.annotation.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 8:10 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(springTest.class)
public class springTest {
    private Logger logger = LoggerFactory.getLogger(springTest.class);
    @Test
    public void test_01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.controllerPrint();
        logger.info("执行成功");
    }
}
