package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @Time 18/5/2024 15:05 周六
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
    public List<Employee> findAll(int page, int size) {
        log.debug("当前分页参数：page={},size={}",page,size);
        PageHelper.startPage(page,size);
        List<Employee> employeeList = empMapper.queryAll();
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList);
        log.debug("当前页员工集合为：{} , 总页数为：{}",pageInfo.getList(),pageInfo.getPages());
        return pageInfo.getList();
    }
}
