package com.javaee.springboot.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 20:52 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
@Aspect
@Order
public class LogAdvice {
    @Before("execution(* com..service.impl.*.*(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("name = " + name);
    }
}
