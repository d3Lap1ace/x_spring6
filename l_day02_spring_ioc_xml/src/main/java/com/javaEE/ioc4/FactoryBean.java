package com.javaEE.ioc4;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 7/5/2024 19:54 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface FactoryBean <T>{
    T getObject();
    boolean isSingleton();
    Class<?> getObjectType();
}
