package com.woxing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void shouldAnswerWithTrue()
    {
        //redis 操作器
        ValueOperations<String, String> redisObj = stringRedisTemplate.opsForValue();

        redisObj.set("sen","你好");
    }
}
