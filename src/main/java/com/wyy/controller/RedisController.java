package com.wyy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/set/{key}/{value}")
    public String setValue(@PathVariable("key") String key, @PathVariable("value") String value){
        redisTemplate.opsForValue().set(key,value);
        //redisTemplate.opsForValue().get(key);
        return key+"****"+value;
    }

    @RequestMapping("/get/{key}")
    public String getValue(@PathVariable("key")String key){
        return redisTemplate.opsForValue().get(key);
    }
}
