package com.javaee.spring6.iocxml.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/3/2024 1:43 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println("根据id获取bean:"+user);

        //根据类型获取bean

        User user1 = context.getBean(User.class);
        System.out.println("根据类型获取bean:"+user1);


        //混合
        User user2 = context.getBean("user", User.class);
        System.out.println("混合获取bean:"+user2);
    }

    public void sayHello1(){
        System.out.println("helloworld");
    }


}
