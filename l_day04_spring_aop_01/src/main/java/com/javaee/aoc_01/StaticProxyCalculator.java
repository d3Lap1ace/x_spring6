package com.javaee.aoc_01;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 9/5/2024 16:55 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class StaticProxyCalculator implements Calculater{

    private Calculater target;

    public StaticProxyCalculator(Calculater target){
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("input param: i = "+i+"j ="+j);
        int result =target.add(i,j);
        System.out.println("运算结果是:"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
