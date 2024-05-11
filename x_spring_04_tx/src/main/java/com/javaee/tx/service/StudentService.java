package com.javaee.tx.service;

import com.javaee.tx.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 11/5/2024 18:11 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentDao studentDao;


    public void updata(){
        studentDao.updataName();
        System.out.println("----------------------");
        studentDao.updataAge();
    }


}
