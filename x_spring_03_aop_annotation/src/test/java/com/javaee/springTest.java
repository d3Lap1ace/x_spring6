package com.javaee;

import com.javaee.javaConfig.javaconfig01;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 10:11 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(javaconfig01.class)
public class springTest {
    private Logger logger = LoggerFactory.getLogger(Calculator.class);

    @Test
    public void testAdd(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_01.xml");
        Calculator calculator = ac.getBean( Calculator.class);
        int add = calculator.add(1, 1);
        logger.info("执行成功:"+add);
    }
}
