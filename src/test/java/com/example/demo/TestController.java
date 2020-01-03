package com.example.demo;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;
//    private JedisCluster jedisCluster;

    @Test
    public void test1(){
        redisTemplate.opsForValue().set("test","test");
        String test = redisTemplate.opsForValue().get("test").toString();
        System.out.println(test);

    }
}
