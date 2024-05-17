package com.mybatisTest;

import com.mybatisHw.mapper.CourseMapper;
import com.mybatisHw.mapper.StudentMapper;
import com.mybatisHw.pojo.Course;

import com.mybatisHw.pojo.Student;
import com.mybatisHw.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 16:51 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class MybatisTest {
    @Test
    public void test_01(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        List<Course> scores = mapper.queryScore();
        scores.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void test_02(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryStScore();
        students.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test_03(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryStAddress();
        students.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test_04(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryScoreAndCourse();
        students.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void test_05(){
        SqlSession sqlSession = SqlSessionUtils.openAutoSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> all = mapper.all();
        all.forEach(System.out::println);
        sqlSession.close();

    }
}
