package com.springmvc.mybatis;


import com.mybatisx.mapper.UserMapper;
import com.mybatisx.pojo.User;
import com.mybatisx.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:59 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {

    @Test
    public void test_02(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void test_01(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        int rows = mapper.insertUser(user);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }
}
