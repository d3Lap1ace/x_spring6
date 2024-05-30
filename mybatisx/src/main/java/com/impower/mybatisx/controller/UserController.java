package com.impower.mybatisx.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.impower.mybatisx.pojo.User;
import com.impower.mybatisx.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 20:28 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
@Tag(name = "用户接口管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "分页及带条件的查询")
    @GetMapping("/{current}/{size}")
    public IPage<User>getPageList(@PathVariable Long current,@PathVariable Long size,String name){
        Page<User> page = new Page<>(current, size);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.like("name",name);
        Page<User> page1 = userService.page(page, userQueryWrapper);
        return page1;
    }

    @Operation(summary = "查询所有")
    @GetMapping("/findAll")
    public List<User> finAll(){
        List<User> list = userService.list();
        return list;
    }

    @Operation(summary = "根据id查询")
    @GetMapping("/getByid/{id}")
    public User getById(@Parameter(name = "id",required = true,description = "用户的主键")
                        @PathVariable String id){
        User byId = userService.getById(id);
        return byId;
    }

    @Operation(summary = "添加用户")
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(@RequestBody User user){
        userService.saveOrUpdate(user);
        return "添加成功";
    }

    @Operation(summary = "根据id删除用户")
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Long id){
        userService.removeById(id);
        return "删除成功";
    }



}
