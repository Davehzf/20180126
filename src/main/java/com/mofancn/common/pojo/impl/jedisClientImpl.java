package com.mofancn.common.pojo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mofancn.common.pojo.jedisClient;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Repository
public class jedisClientImpl implements jedisClient {

	@Autowired
	private JedisPool JedisPool;

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		String result = jedis.get(key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return result;
	}

	@Override
	public String set(String key, String value) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		String string = jedis.set(key, value);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return string;
	}

	@Override
	public String hget(String hkey, String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return string;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long hset = jedis.hset(hkey, key, value);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return hset;
	}

	@Override
	public long expire(String key, int value) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long expire = jedis.expire(key, value);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return expire;
	}

	@Override
	public long incr(String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long incr = jedis.incr(key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return incr;
	}

	@Override
	public long ttl(String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long ttl = jedis.ttl(key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return ttl;
	}

	@Override
	public long del(String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long result = jedis.del(key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return result;
	}

	@Override
	public long hdel(String hkey, String key) {
		// TODO Auto-generated method stub
		Jedis jedis = JedisPool.getResource();
		long result = jedis.hdel(hkey, key);
		jedis.close();
		//JedisPool.returnResourceObject(jedis);
		return result;
	}

}
