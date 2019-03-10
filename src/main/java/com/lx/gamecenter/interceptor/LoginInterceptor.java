package com.lx.gamecenter.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lx.gamecenter.common.util.CacheUtil;
import com.lx.gamecenter.common.util.EmptyUtil;
import com.lx.gamecenter.controller.base.BaseController;

public class LoginInterceptor extends BaseController implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String jSessionId = this.getJSessionId(request);
		Object userJson = CacheUtil.get(jSessionId);
		if (!EmptyUtil.isEmpty(userJson)) {
			CacheUtil.expire(jSessionId, 60);
			return true;
		}
		response.sendRedirect(request.getContextPath() + "/login");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		
	}

}
