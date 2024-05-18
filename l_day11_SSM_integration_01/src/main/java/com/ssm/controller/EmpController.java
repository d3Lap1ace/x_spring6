package com.ssm.controller;

import com.ssm.pojo.Employee;
import com.ssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 18/5/2024 14:47 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("list")
    public List<Employee>list(){
        List<Employee>all = empService.findAll();
        return all;
    }
}
