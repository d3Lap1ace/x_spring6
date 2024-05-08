package com.javaEE.ioc6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.naming.spi.InitialContextFactory;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 15:59 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class UserService implements InitializingBean, DisposableBean {

    public UserService(){
        System.out.println("UserSevice.usersevice");
    }

    public void start(){
        System.out.println("start............");
    }

    public void end(){
        System.out.println("end............................");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy.............................");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet......................");
    }
}
