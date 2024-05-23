package com.javaee.springboot.autoconfig;

import com.javaee.springboot.factorybeans.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 18:56 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
public class MybatisAutoConfiguration {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        return new SqlSessionFactoryBean();
    }
}
