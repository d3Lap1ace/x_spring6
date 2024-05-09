package com.javaee.ioc;

import com.javaee.config.JavaConfig;
import com.javaee.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 9/5/2024 14:24 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringTest02 {
    @Autowired
    private StudentController studentController;
    @Test
    public void test01(){
        studentController.findAll();
    }
}
