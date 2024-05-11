package com.javaee.tx;

import com.javaee.tx.config.javaconfig01;
import com.javaee.tx.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 18:18 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringJUnitConfig(javaconfig01.class)
public class SpringTestAnnotation {
    @Autowired
    private StudentService studentService;
    @Test
    public void test01(){
        studentService.updata();
    }
}
