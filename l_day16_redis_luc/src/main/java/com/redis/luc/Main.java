package com.redis.luc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    //简单序列化
    @Bean
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String,String> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        // 设置键序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 设置简单类型值的序列化方式
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        // 设置默认序列化方式
        redisTemplate.setDefaultSerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    //加载lua脚本，设置返回值类型
    @Bean
    public RedisScript<Boolean> script() {
        Resource scriptSource = new ClassPathResource("lua/test.lua");
        return RedisScript.of(scriptSource, Boolean.class);
    }
}