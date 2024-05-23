package com.javaee.tx.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 18:19 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Configuration
@ComponentScan("com.javaee.tx")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class javaconfig01 {
    @Bean("dataSource")
    public DataSource duril(@Value("${jdbc.url}") String url,
                            @Value("${jdbc.driver}") String driver,
                            @Value("${jdbc.username}") String username,
                            @Value("${jdbc.password}") String password){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
