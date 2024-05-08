package com.javaee.controller;

import com.javaee.pojo.Student;
import com.javaee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 20:31 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
public class StudentController {
    @Autowired
    public StudentService studentService;

    public void findAll(){
        List<Student> studentList = studentService.findAll();
        System.out.println("studentList = " + studentList);
    }
}
