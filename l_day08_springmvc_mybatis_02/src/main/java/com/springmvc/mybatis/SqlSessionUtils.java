package com.springmvc.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:52 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class SqlSessionUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream ips = null;

        try {
            ips = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
    }

    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }

    public static SqlSession openAutoSession() {
        return sqlSessionFactory.openSession(true);
    }

    public static void closeSession(SqlSession sqlSession) {
        sqlSession.close();
    }
}

