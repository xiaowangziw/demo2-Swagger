package com.example.demo;

import com.example.demo.untils.RedisTool;
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
    private JedisCluster jedisCluster;
    //    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        boolean test1 = RedisTool.tryGetDistributedLock(jedisCluster, "testKey2", "testValue", 6000);
        System.out.println(test1);
        Boolean test = jedisCluster.exists("test");
        System.out.println(test);
        Long append = jedisCluster.append("test", "test");
        System.out.println(jedisCluster.exists("test"));
    }
}
