package com.javaeemvc.controller;

import com.javaeemvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 12/5/2024 18:14 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
@ResponseBody
@RequestMapping("user")
public class UserController {
    @GetMapping
    public String queryPage(@RequestParam(name = "page",defaultValue = "1") int page,
                            @RequestParam(name = "size",defaultValue = "10") int size){

        System.out.println("UserController.queryPage");
        System.out.println("page = " + page + ", size = " + size);
        return "queryPage success";
    }
    @PostMapping
    public String addUser(User user){
        System.out.println("UserController.addUser");
        System.out.println("user = " + user);
        return "addUSer success";
    }
    @GetMapping("{id}")
    public String detailUser(@PathVariable String id){

        System.out.println("UserController.detailUser");
        System.out.println("id = " + id);
        return "detailUser success";
    }
    @PutMapping
    public String updataUser(@RequestParam Integer id,
                             @RequestParam String name,
                             @RequestParam Integer age){
        System.out.println("UserController.updataUser");
        System.out.println("id = " + id + ", name = " + name + ", age = " + age);
        return  "updataUser success";
    }
    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable String id){
        System.out.println("UserController.deleteUser");
        System.out.println("id = " + id);
        return "deleteUser success";
    }
    @GetMapping("search")
    public User search(String keyword,
                       @RequestParam(defaultValue = "10") int size,
                       @RequestParam(defaultValue = "1") int page){
        System.out.println("keyword = " + keyword + ", size = " + size + ", page = " + page);
        System.out.println("UserController.search");
        User user = new User();
        user.setId(1);
        user.setName("高圆圆");
        user.setAge(18);
        return user;
    }



}
