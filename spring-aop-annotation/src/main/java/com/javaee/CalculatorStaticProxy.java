package com.javaee;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 6/5/2024 20:24 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class CalculatorStaticProxy implements Calculator{
    // 将被代理的目标对象声明为成员变量
    private Calculator target;

    public CalculatorStaticProxy(Calculator target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {

        // 附加功能由代理类中的代理方法来实现
        System.out.println("参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务逻辑
        int addResult = target.add(i, j);

        System.out.println("方法内部 result = " + addResult);

        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        int subResult = target.sub(i,j);
        System.out.println("subResult = " + subResult);
        return subResult;
    }

    @Override
    public int mul(int i, int j) {
        int mulResult = target.mul(i,j);
        System.out.println("mulResult = " + mulResult);
        return mulResult;
    }

    @Override
    public int div(int i, int j) {
        int divResult = target.div(i,j);
        System.out.println("divResult = " + divResult);
        return divResult;
    }
}
