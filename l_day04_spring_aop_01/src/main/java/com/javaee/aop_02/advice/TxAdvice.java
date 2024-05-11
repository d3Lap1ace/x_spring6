package com.javaee.aop_02.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 11:16 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
@Aspect
public class TxAdvice {
    @Before("execution(* com..aop_02.impl.*.*(..))")
    public void start(){
        System.out.println("开启事务!");
    }


    @AfterReturning("execution(* com..aop_02.impl.*.*(..))")
    public void commit(){
        System.out.println("提交事务!");
    }

    @AfterThrowing("execution(* com..aop_02.impl.*.*(..))")
    public void rollback(){
        System.out.println("事务回滚!");
    }
}
