package com.springMvc.recetion;

import com.springMvc.recetion.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 23/5/2024 17:11 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("show")
    public String show(){
        System.out.println("UserController.show");
        return "show success!";
    }
    @PostMapping("login")
    public String login(@RequestParam(name ="account")String username,
                        @RequestParam String password,
                        @RequestParam(defaultValue = "who")String nickname){
        System.out.println("username = " + username + ", password = " + password + ", nickname = " + nickname);
        return "login success!";
    }
    @GetMapping("register")
    public String register(){
        System.out.println("UserController.register");
        return "register success!";
    }

    @RequestMapping("{type}/{id}")
    public String docid(@PathVariable String type,
                        @PathVariable Integer id,
                        @RequestParam(defaultValue = "xxx") String info){
        System.out.println("UserController.docid");
        System.out.println("type = " + type + ", id = " + id + ", info = " + info);
        return "docid success!";
    }

    @PostMapping("save1")
    public String save1(@RequestBody String json){
        System.out.println("UserController.save1");
        System.out.println("json = " + json);
        return "save1 success";
    }

    @PostMapping("save2")
    public User save2(@RequestBody User user){
        System.out.println("user = " + user);
        System.out.println("UserController.save2");
        return user;
    }







}
