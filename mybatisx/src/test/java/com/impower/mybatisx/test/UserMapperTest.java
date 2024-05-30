package com.impower.mybatisx.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.impower.mybatisx.mapper.UserMapper;
import com.impower.mybatisx.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 09:01 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void testGetPageWithQueryWrapper(){
        Page<User> userPage = new Page<>(2, 2);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        QueryWrapper<User> email = userQueryWrapper.like("email", "maolizhi@163,com");
        long total = userPage.getTotal();
        System.out.println("total = " + total);
        long pages = userPage.getPages();
        System.out.println("pages = " + pages);
        List<User> records = userPage.getRecords();
        records.forEach(System.out::println);
    }

    @Test
    public void testGetPage(){
        Page<User> page = new Page<>(1,3);
        page = userMapper.selectPage(page,null);
        long total = page.getTotal();
        System.out.println("total = " + total);

        long pages = page.getPages();
        System.out.println("pages = " + pages);

        List<User> records = page.getRecords();
        records.forEach(System.out::println);

        long current = page.getCurrent();
        System.out.println("current = " + current);

        long size = page.getSize();
        System.out.println("size = " + size);
    }

    @Test
    public void testUpdata() {
        User user = userMapper.selectById(5);
        user.setAge(21);
        user.setName("毛慧智");
        user.setEmail("maolizhi@163.com");
        userMapper.updateById(user);
    }

    @Test
    public void testFindAll() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        User user = new User("毛小智", 3, "maolizhi@163.com");
        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
    }

    @Test
    public void testQueryByid() {
        User user = userMapper.selectById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void testBatch() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<User> users = userMapper.selectBatchIds(list);
        users.forEach(System.out::println);
    }

    @Test
    public void testQueryWrapper() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        List<User> users = userMapper.selectList(userQueryWrapper.ge("age", 20).like("name", "毛"));
        users.forEach(System.out::println);
    }

    @Test
    public void testLambdaQueryWrapper() {

        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<User> users = userMapper.selectList(userLambdaQueryWrapper.gt(User::getAge, 30));
        users.forEach(System.out::println);
    }

}