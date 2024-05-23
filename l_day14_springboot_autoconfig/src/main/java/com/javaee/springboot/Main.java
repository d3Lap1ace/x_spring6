package com.javaee.springboot;

import com.javaee.springboot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class,args);
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount = " + beanDefinitionCount);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
    @Bean
    public User user(){
        return new User();
    }
}