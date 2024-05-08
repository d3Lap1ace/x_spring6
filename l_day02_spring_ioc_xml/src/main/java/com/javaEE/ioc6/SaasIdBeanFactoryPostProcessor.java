package com.javaEE.ioc6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 15:54 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SaasIdBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition order = beanFactory.getBeanDefinition("order");
        order.getPropertyValues().addPropertyValue("id",001);
    }
}
