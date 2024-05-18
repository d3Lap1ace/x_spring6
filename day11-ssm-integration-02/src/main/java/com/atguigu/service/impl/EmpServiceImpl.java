package com.atguigu.service.impl;

import com.atguigu.mapper.EmpMapper;
import com.atguigu.pojo.Employee;
import com.atguigu.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public List<Employee> findAll(int page , int size) {
        log.debug("当前分页参数：page={},size={}",page,size);
        PageHelper.startPage(page,size);
        List<Employee> employeeList = empMapper.queryAll();
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList);
        log.debug("当前页员工集合为：{} , 总页数为：{}",pageInfo.getList(),pageInfo.getPages());
        return pageInfo.getList();
    }
}
