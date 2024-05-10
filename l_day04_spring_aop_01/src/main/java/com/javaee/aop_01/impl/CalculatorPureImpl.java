package com.javaee.aop_01.impl;

import com.javaee.aop_01.Calculator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 10:34 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
public class CalculatorPureImpl implements Calculator {

    @Override
    public int add(int i, int j) {



        int result = i + j; //核心业务


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
        return result;
    }
}
