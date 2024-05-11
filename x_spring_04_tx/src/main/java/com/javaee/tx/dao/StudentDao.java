package com.javaee.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 18:10 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updataName(){
        String sql = "update students set name = ? where id = ?;";
        int rows = jdbcTemplate.update(sql, "hhh", 2);
        System.out.println("row = " + rows);

    }
    public void updataAge(){
        String sql = "update students set age = ? where id = ?;";
        int rows = jdbcTemplate.update(sql, 28, 1);
        System.out.println("rows = " + rows);

    }
}
