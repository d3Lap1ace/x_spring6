package com.javaee;

import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 10:03 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {

        int result = i + j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
