package com.lx.gamecenter.controller.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lx.gamecenter.common.util.EmptyUtil;
import com.lx.gamecenter.controller.base.BaseController;
import com.lx.gamecenter.entity.user.User;
import com.lx.gamecenter.service.login.intf.LoginService;

/**
 * @Title:  LoginController.java   
 * @Package com.lx.gamecenter.controller.login   
 * @Description: 登录管理
 * @author: Lixin
 * @date:   2019年3月17日 下午8:25:22   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Controller
public class LoginController extends BaseController {
	
	@Autowired
	private LoginService	loginService;

	/**
	 * @Title: login   
	 * @Description: 进入登录页面
	 * @param: @param request
	 * @param: @return      
	 * @return: ModelAndView      
	 * @throws
	 */
	@RequestMapping("/login")
	public ModelAndView	login(HttpServletRequest request) {
		Object userSession = request.getSession().getAttribute("user");
		if (!EmptyUtil.isEmpty(userSession)) {
			return new ModelAndView("redirect:/landlord/home");
		}
		return new ModelAndView("login/login");
	}
	
	/**
	 * @Title: register   
	 * @Description: 进入注册页面
	 * @param: @param request
	 * @param: @return      
	 * @return: ModelAndView      
	 * @throws
	 */
	@RequestMapping("/register")
	public ModelAndView	register(HttpServletRequest request) {
		Object userSession = request.getSession().getAttribute("user");
		if (!EmptyUtil.isEmpty(userSession)) {
			return new ModelAndView("redirect:/landlord/home");
		}
		return new ModelAndView("login/register");
	}
	
	/**
	 * @Title: loginSubmit   
	 * @Description: 登录提交
	 * @param: @param request
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/login/submit")
	public String loginSubmit(HttpServletRequest request) {
		Map<String, Object> params = this.getParams(request);
		User user = this.loginService.loginSubmit(params);
		if (EmptyUtil.isEmpty(user)) {
			return "redirect:/login";
		}
		request.getSession().setAttribute("user", user);
		return "redirect:/";
	}
	
	/**
	 * @Title: registerSubmit   
	 * @Description: 注册提交
	 * @param: @param request
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/register/submit")
	public String registerSubmit(HttpServletRequest request) {
		return this.getParams(request).toString();
	}
	
	/**
	 * @Title: logout   
	 * @Description: 注销登录
	 * @param: @param request
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return "redirect:/";
	}
}
