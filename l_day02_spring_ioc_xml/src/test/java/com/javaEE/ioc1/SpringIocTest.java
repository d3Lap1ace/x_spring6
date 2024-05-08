package com.javaEE.ioc1;

import com.javaEE.ioc1.SpringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 7/5/2024 16:05 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SpringIocTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_01.xml");
        SpringUtils stringUtils = context.getBean("stringUtils", SpringUtils.class);
        stringUtils.say();

    }
}
