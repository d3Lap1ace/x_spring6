package com.javaEE.ioc3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 7:39 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before" + beanName + " = " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after" + beanName + " = " + bean);
        return bean;
    }

}
