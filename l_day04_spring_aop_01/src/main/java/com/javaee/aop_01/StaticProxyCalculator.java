package com.javaee.aop_01;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/9/2024 10:35 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class StaticProxyCalculator implements Calculator {

    private Calculator target;

    public StaticProxyCalculator(Calculator target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {

        System.out.println("input param： i  = " + i + " j = " + j );

        int result = target.add(i, j);

        System.out.println("运算结果： result =" + result );

        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("input param： i  = " + i + " j = " + j );

        int result = target.sub(i, j);

        System.out.println("运算结果： result =" + result );

        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("input param： i  = " + i + " j = " + j );

        int result = target.mul(i, j);

        System.out.println("运算结果： result =" + result );

        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("input param： i  = " + i + " j = " + j );

        int result = target.div(i, j);

        System.out.println("运算结果： result =" + result );

        return result;
    }
}
