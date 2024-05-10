package com.javaEE.ioc3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 7:49 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SaasIdBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //我们就可以修改bean的定义信息 beanFactory -> bean的定义信息
        System.out.println("修改bean的定义信息 beanFactory -> bean的定义信息");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
        System.out.println("getPropertyValues() 获取里层property");
        //getPropertyValues() 获取里层property
        beanDefinition.getPropertyValues().addPropertyValue("username","root");

    }
}
