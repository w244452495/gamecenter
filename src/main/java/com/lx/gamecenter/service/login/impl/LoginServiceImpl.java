package com.lx.gamecenter.service.login.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lx.gamecenter.dao.login.LoginDao;
import com.lx.gamecenter.entity.user.User;
import com.lx.gamecenter.service.login.intf.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao	loginDao;

	public User loginSubmit(Map<String, Object> params) {
		return this.loginDao.loginSubmit(params);
	}
}
