package com.javaee.spring6.iocxml.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/3/2024 1:59 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Student student = ac.getBean("studentOne",Student.class);
        System.out.println(student);

        Student studentTwo = ac.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);

        Student studentThree = ac.getBean("studentThree", Student.class);
        System.out.println(studentThree);

        Student studentFour = ac.getBean("studentFour", Student.class);
        System.out.println(studentFour);

        Student studentFive = ac.getBean("studentFive", Student.class);
        System.out.println(studentFive);

        Student studentSix = ac.getBean("studentSix", Student.class);
        System.out.println(studentSix);
    }
}
