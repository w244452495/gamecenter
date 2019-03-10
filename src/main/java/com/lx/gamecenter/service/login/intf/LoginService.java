package com.lx.gamecenter.service.login.intf;

import java.util.Map;

import com.lx.gamecenter.entity.user.User;

public interface LoginService {
	
	User loginSubmit(Map<String, Object> params);

}
