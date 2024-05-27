package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 21:11 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages = {"com.spring"})
public class SpringConfig {


}
