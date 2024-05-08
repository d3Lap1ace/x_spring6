package com.javaee.service.impl;

import com.javaee.dao.StudentDao;
import com.javaee.dao.impl.StudentDaoImpl;
import com.javaee.pojo.Student;
import com.javaee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 20:29 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryALl();
        return studentList;
    }
}
