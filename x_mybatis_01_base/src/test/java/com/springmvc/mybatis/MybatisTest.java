package com.springmvc.mybatis;


import com.mybatisx.mapper.UserMapper;
import com.mybatisx.pojo.User;
import com.mybatisx.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;



/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:59 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    private UserMapper mapper;
    @BeforeEach
    public void init(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void test_05(){
        HashMap<String,Object> map = new HashMap<>();
        map.put("uhooby","man");
        map.put("uid",8);
        int rows = mapper.updateUserByid(map);
        System.out.println("rows = " + rows);
    }
    @Test
    public void test_04(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryHooby(1);
        System.out.println("hooby = " + user.getUhooby());
    }
    @Test
    public void test_03(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int rows = mapper.deleteByid(9);
        System.out.println("rows = " + rows);
    }

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
        user.setUage(20);
        user.setUhooby("舔老婆");
        user.setUname("毛大智");
        user.setUgender("woman");
        int rows = mapper.insertUser(user);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }
}
