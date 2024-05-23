package com.javaee.springboot.factorybeans;

import com.javaee.springboot.mybatis.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 22/5/2024 18:59 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    @Override
    public SqlSessionFactory getObject() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactory();
        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }
}
