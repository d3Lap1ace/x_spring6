package com.javaee.dao.impl;

import com.javaee.dao.StudentDao;
import com.javaee.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 20:15 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository
public class StudentDaoImpl implements StudentDao {


    @Autowired
    private DataSource dataSource;

    @Override
    public List<Student> queryALl() {
        List<Student> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            String sql = "select * from students";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGender(resultSet.getString("gender"));
                student.setAge(resultSet.getInt("age"));
                student.setClasses(resultSet.getString("class"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
