package com.javaee.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 9/5/2024 14:17 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
@ComponentScan("com.javaee")
@PropertySource({"classpath:jdbc.properties", "classpath:jdbc.properties"})
public class JavaConfig {
    @Bean
    public DataSource dataSource(@Value("${jdbc.url}")String url,
                                 @Value("${jdbc.driver}")String driver,
                                 @Value("${jdbc.user}")String username,
                                 @Value("${jdbc.password}")String password){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}









