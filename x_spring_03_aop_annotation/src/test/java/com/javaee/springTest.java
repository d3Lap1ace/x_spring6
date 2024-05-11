package com.javaee;

import com.javaee.Calculator.Calculator;
import com.javaee.javaConfig.javaconfig01;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public Calculator calculator;

    @Test
    public void testAdd(){

        int add = calculator.add(1, 1);
        logger.info("执行成功:"+add);
    }
}
