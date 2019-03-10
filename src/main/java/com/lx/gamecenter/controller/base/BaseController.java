package com.lx.gamecenter.controller.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lx.gamecenter.common.util.EmptyUtil;

public abstract class BaseController {

	protected Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected Integer page;
	
	protected Integer pageSize;
	
	protected Map<String, Object> getParams(HttpServletRequest request) {
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (EmptyUtil.isEmpty(parameterMap)) {
			return new HashMap<>();
		}
		Map<String, Object> params = new HashMap<>();
		for(Entry<String, String[]> entry : parameterMap.entrySet()) {
			if ("rows".equals(entry.getKey())) {
				this.pageSize = Integer.parseInt(entry.getValue()[0]);
			} else if ("page".equals(entry.getKey())) {
				this.page = Integer.parseInt(entry.getValue()[0]);
			} else {
				params.put(entry.getKey(), entry.getValue()[0]);
			}
		}
		return params;
	}
	
	protected String getJSessionId(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			if ("JSESSIONID".equals(cookie.getName())) {
				return cookie.getValue();
			}
		}
		return "";
	}
}
