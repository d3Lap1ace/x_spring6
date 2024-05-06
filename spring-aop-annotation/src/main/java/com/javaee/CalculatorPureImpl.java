package com.javaee;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 6/5/2024 20:18 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class CalculatorPureImpl implements Calculator{
    @Override
    public int add(int i, int j) {

        System.out.println("参数是：" + i + "," + j);
        int result = i + j;
        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("参数是：" + i + "," + j);

        int result = i - j;

        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {

        System.out.println("参数是：" + i + "," + j);

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        System.out.println("参数是：" + i + "," + j);

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
