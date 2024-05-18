package com.atguigu.controller;

import com.atguigu.pojo.Employee;
import com.atguigu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName: com.atguigu.controller
 *
 * @author: 赵伟风
 * description:
 */

@RestController
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    // get /emp/list {}
    @GetMapping("list")
    public List<Employee> list(){
        List<Employee> all = empService.findAll();
        return  all;
    }
}
