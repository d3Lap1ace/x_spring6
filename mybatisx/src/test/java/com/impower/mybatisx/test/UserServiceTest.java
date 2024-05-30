package com.impower.mybatisx.test;

import com.impower.mybatisx.pojo.User;
import com.impower.mybatisx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 09:02 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;


    @Test
    public void testFindAll(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

    @Test
    public void testSave(){
        User user = new User("毛火智", 24, "maolizhi@163.com");
        userService.save(user);
    }

    @Test
    public void testGetByid(){
        User byId = userService.getById(1);
        System.out.println("byId = " + byId);
    }

    @Test
    public void testUpdateByid(){
        User user = new User("毛木智", 29, "maolizhi@163.com");
        userService.updateById(user);
    }

    @Test
    public void testSaveOrUpdata(){
        User user = new User("毛金智", 12, "maolizhi@163.com");
        userService.saveOrUpdate(user);
    }

    @Test
    public void testDelete(){
        boolean b = userService.removeById(11);
        System.out.println("b = " + b);
    }

    @Test
    public void testBatch(){
        User user = new User("毛弱智", 24, "maolizhi@163.com");
        User user1 = new User("毛敏智", 21, "maolizhi@163.com");
        User user2 = new User("毛信智", 21, "maolizhi@163.com");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user);
        boolean b = userService.saveOrUpdateBatch(users);
        System.out.println("b = " + b);

    }






}
