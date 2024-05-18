package com.atguigu.service.impl;

import com.atguigu.mapper.EmpMapper;
import com.atguigu.pojo.Employee;
import com.atguigu.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: com.atguigu.service.impl
 *
 * @author: 赵伟风
 * description:
 */

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {


    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = empMapper.queryAll();
        log.debug("查询的员工集合为：{}",employeeList);
        return employeeList;
    }
}
