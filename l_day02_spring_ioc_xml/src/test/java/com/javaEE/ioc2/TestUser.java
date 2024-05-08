package com.javaEE.ioc2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/3/2024 1:05 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_02.xml");
        User user = (User)ac.getBean("user");
        user.run();
        logger.info("执行成功");

    }
}
