package com.java.tx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 14:56 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
@ComponentScan("com.java.tx")
@PropertySource("classpath:jdbc.properties")
public class TxConfig {

}
