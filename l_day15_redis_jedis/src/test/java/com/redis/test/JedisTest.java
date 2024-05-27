package com.redis.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 24/5/2024 16:16 周五
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class JedisTest {
    private Jedis jedis;
    @BeforeEach
    public void init(){
        jedis = new Jedis("192.168.1.2", 6379);
    }
    @Test
    public void test_01(){
        String ping = jedis.ping();
        System.out.println("ping = " + ping);
    }
    @Test
    public void test_02(){
        jedis.set("user:1:name","root");
        String s = jedis.get("user:1:name");
        System.out.println("s = " + s);
    }
    @AfterEach
    public void end(){
        jedis.close();
    }


}
