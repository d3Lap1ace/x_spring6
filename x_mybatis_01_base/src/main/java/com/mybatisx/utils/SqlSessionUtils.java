package com.mybatisx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/25/2024 9:20 PM Sat
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
    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
    public static SqlSession openAutoSession(){
        return sqlSessionFactory.openSession(true);
    }
    public static void closeSession(SqlSession sqlSession){
        sqlSession.close();
    }

}
