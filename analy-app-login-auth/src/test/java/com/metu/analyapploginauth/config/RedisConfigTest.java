package com.metu.analyapploginauth.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName RedisConfigTest
 * @Description TODO
 * @Author admin
 * @Date 2019/11/26 22:57
 * @Version 1.0
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class RedisConfigTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set(){
        redisTemplate.opsForValue().set("test","testValue1");
    }
}
