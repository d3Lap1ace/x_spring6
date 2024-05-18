package com.atguigu.controller;

import com.atguigu.pojo.Employee;
import com.atguigu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    // get  /emp/list    param: page = 1 , size  = 2             {}
    @GetMapping("list")
    public List<Employee> list(@RequestParam(defaultValue = "1") int page,
                               @RequestParam(defaultValue = "2") int size){
        List<Employee> all = empService.findAll(page,size);
        return  all;
    }
}
