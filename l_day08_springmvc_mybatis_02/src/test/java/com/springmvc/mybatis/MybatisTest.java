package com.springmvc.mybatis;

import com.springmvc.mybatis.mapper.UserMapper;
import com.springmvc.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

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
    @Test
    public void test_01() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setName("elife");
        user.setSalary(9992.0);
        int rows = mapper.insertUser(user);
        System.out.println("rows = " + rows);
        SqlSessionUtils.closeSession(sqlSession);
    }

    @Test
    public void test_02() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int rows = mapper.deleteById(3);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }

    @Test
    public void test_03() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(2);
        user.setName("yinaifa");
        user.setSalary(250.0);
        int rows = mapper.updateUser(user);
        System.out.println("rows = " + rows);
        sqlSession.close();
    }

    @Test
    public void test_04() {
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryById(2);
        System.out.println("user = " + user);
        sqlSession.close();
    }

    @Test
    public void test_05(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        userList.forEach(System.out::println);
        sqlSession.close();
    }
}
