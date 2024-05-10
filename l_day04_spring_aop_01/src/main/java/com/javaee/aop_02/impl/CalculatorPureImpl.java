package com.javaee.aop_02.impl;

import com.javaee.aop_02.Calculator;
import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 11:07 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
public class CalculatorPureImpl implements Calculator {

    @Override
    public int add(int i, int j) {
        int result = i + j; //核心业务
        System.out.println("-------");
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("-----");
        return result;
    }
}
