package com.lx.gamecenter.controller.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.lx.gamecenter.common.util.CacheUtil;
import com.lx.gamecenter.common.util.EmptyUtil;
import com.lx.gamecenter.controller.base.BaseController;
import com.lx.gamecenter.entity.user.User;
import com.lx.gamecenter.service.login.intf.LoginService;

@Controller
public class LoginController extends BaseController {
	
	@Autowired
	private LoginService	loginService;

	@RequestMapping("/login")
	public ModelAndView	login(HttpServletRequest request) {
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/register")
	public ModelAndView	register(HttpServletRequest request) {
		return new ModelAndView("login/register");
	}
	
	@RequestMapping("/login/submit")
	public String loginSubmit(HttpServletRequest request) {
		Map<String, Object> params = this.getParams(request);
		User user = this.loginService.loginSubmit(params);
		if (EmptyUtil.isEmpty(user)) {
			return "login/login";
		}
		String key = this.getJSessionId(request);
		CacheUtil.setAndExpire(key, JSON.toJSONString(user), 60);
		System.out.println(CacheUtil.get(key));
		request.getSession().setAttribute("user", user);
		return "/landload/home";
	}
	
	@ResponseBody
	@RequestMapping("/register/submit")
	public String registerSubmit(HttpServletRequest request) {
		return this.getParams(request).toString();
	}
}
