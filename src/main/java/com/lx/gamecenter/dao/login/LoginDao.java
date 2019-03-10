package com.lx.gamecenter.dao.login;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lx.gamecenter.entity.user.User;

@Repository
public interface LoginDao {
	
	public User loginSubmit(Map<String, Object> params);
	
	public int insert(Map<String, Object> params);
	
}
