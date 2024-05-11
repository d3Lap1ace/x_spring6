package com.javaee;

import com.javaee.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 17:51 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(locations = "classpath:spring_01.xml")
public class springXmlTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void test01(){
        System.out.println(calculator);
        calculator.add(1,1);
    }
}
