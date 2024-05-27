package com.redis.lucTest;

import com.redis.luc.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 25/5/2024 11:36 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootTest(classes = Main.class)
public class RedisLucTest {

    @Autowired
    private RedisScript<Boolean> script;

    @Autowired
    private RedisTemplate<String,String>redisTemplate;

    @Test
    public void test_01(){

    }


}
