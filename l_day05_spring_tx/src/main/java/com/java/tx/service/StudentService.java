package com.java.tx.service;

import com.java.tx.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 14:51 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void updata(){
        studentDao.updataName();
        System.out.println("----------------");
        System.out.println(1/0);
        studentDao.updataAge();

    }
}
