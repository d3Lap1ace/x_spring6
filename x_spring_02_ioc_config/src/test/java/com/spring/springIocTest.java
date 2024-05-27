package com.spring;

import com.spring.config.SpringConfig;
import com.spring.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 21:25 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class springIocTest {

    @Test
    public void test_01(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        User bean = ac.getBean(User.class);
        bean.getHooby();
    }
}
