package com.javaee.aop_02.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 11:09 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
@Aspect
public class LogAdvice {
    @Before("execution(public int com.javaee.aop_02.impl.CalculatorPureImpl.*(..))") //目标方法执行之前
    public void before(){
        System.out.println("老弟来了");
    }

    //目标方法之后 【返回增强】
    @AfterReturning(value = "execution(* com.javaee.aop_02.impl.CalculatorPureImpl.*(..))")
    public void after(){
        System.out.println("老弟拜拜！");
    }
}
