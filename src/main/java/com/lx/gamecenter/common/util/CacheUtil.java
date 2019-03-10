package com.lx.gamecenter.common.util;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class CacheUtil {

	private static RedisTemplate<String, Object> redisTemplate;
	
	@Autowired(required = true)
	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {  
		CacheUtil.redisTemplate = redisTemplate;  
    }
	
	public static void expire(String key, long time) {
		redisTemplate.expire(key, time, TimeUnit.SECONDS);
	}
	
	public static void set(String key, String value) {
		redisTemplate.opsForValue().set(key, value);
	}
	
	public static void setAndExpire(String key, String value, long time) {
		redisTemplate.opsForValue().set(key, value);
		expire(key, time);
	}
	
	public static Object get(String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
	public static void del(String key) {
		redisTemplate.delete(key);
	}
}
