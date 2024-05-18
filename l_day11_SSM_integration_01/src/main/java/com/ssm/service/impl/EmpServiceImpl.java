package com.ssm.service.impl;

import com.ssm.mapper.EmpMapper;
import com.ssm.pojo.Employee;
import com.ssm.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 18/5/2024 14:51 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Employee> findAll() {
        List<Employee>employeeList = empMapper.queryAll();
        log.debug("查询的员工合集为:{}",employeeList);
        return employeeList;
    }
}
