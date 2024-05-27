package com.redis.test;

import com.bootredis.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 24/5/2024 16:40 周五
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootTest(classes = Main.class)

public class RedisTest {


    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString(){

        redisTemplate.opsForValue().set("name","xxx");
        String result = (String) redisTemplate.opsForValue().get("name");

        System.out.println("result = " + result);
    }

}
