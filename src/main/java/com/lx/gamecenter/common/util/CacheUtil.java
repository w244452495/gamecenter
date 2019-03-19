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
	
	/**
	 * @Title: expire   
	 * @Description: redis设置超时时间
	 * @param: @param key
	 * @param: @param time      
	 * @return: void      
	 * @throws
	 */
	public static void expire(String key, long time) {
		redisTemplate.expire(key, time, TimeUnit.SECONDS);
	}
	
	/**
	 * @Title: set   
	 * @Description: 保存一个string
	 * @param: @param key
	 * @param: @param value      
	 * @return: void      
	 * @throws
	 */
	public static void set(String key, String value) {
		redisTemplate.opsForValue().set(key, value);
	}
	
	/**
	 * @Title: setAndExpire   
	 * @Description: 保存一个string并设置超时时间
	 * @param: @param key
	 * @param: @param value
	 * @param: @param time      
	 * @return: void      
	 * @throws
	 */
	public static void setAndExpire(String key, String value, long time) {
		redisTemplate.opsForValue().set(key, value);
		expire(key, time);
	}
	
	/**
	 * @Title: get   
	 * @Description: 获取一个string
	 * @param: @param key
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	public static Object get(String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
	/**
	 * @Title: del   
	 * @Description: 删除
	 * @param: @param key      
	 * @return: void      
	 * @throws
	 */
	public static void del(String key) {
		redisTemplate.delete(key);
	}
	
	/**
	 * @Title: hset   
	 * @Description: 向hash保存一个值
	 * @param: @param key
	 * @param: @param hashKey
	 * @param: @param value      
	 * @return: void      
	 * @throws
	 */
	public static void hset(String key, String hashKey, String value) {
		redisTemplate.opsForHash().put(key, hashKey, value);
	}
	
	public static void test(String key, String hashKey, String value, long number) {
		redisTemplate.opsForHash().put(key, hashKey, value);// hset
		redisTemplate.opsForHash().get(key, hashKey);// hget
		redisTemplate.opsForHash().delete(key, hashKey);// hdel 第二个参数可变
		redisTemplate.opsForHash().increment(key, hashKey, 1);// hincr
		redisTemplate.opsForHash().increment(key, hashKey, -1);// hdecr
		redisTemplate.opsForHash().increment(key, hashKey, number);// hincrBy
		redisTemplate.opsForHash().keys(key);// hkeys
		redisTemplate.opsForHash().values(key);// hvals
		redisTemplate.opsForValue().increment(key, 1);// incr
		redisTemplate.opsForValue().increment(key, -1);// decr
		redisTemplate.opsForValue().increment(key, number);// incrBy
	}
}
