package com.redis.txTest;

import com.redis.tx.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 25/5/2024 11:50 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@SpringBootTest(classes = Main.class)
public class RedisTxTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test_01() {
        redisTemplate.setEnableTransactionSupport(true);

        Object execute = redisTemplate.execute(new SessionCallback<Object>() {
            @Override
            public Object execute(RedisOperations operations) throws DataAccessException {
                operations.watch("key1"); // 看守key
                operations.multi(); // 开启事务
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    operations.opsForValue().set("key1", "value1");
                    operations.opsForValue().set("key2", "value2");
                    operations.exec(); // 提交事务
                } catch (Exception e) {
                    e.printStackTrace();
                    operations.discard();
                }
                return "xxx";
            }
        });
        System.out.println("execute = " + execute);
    }
}
