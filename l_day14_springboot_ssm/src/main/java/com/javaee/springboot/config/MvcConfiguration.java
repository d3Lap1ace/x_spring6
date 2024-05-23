package com.javaee.springboot.config;

import com.javaee.springboot.interceptors.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 19:44 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/user/list");
    }
}
