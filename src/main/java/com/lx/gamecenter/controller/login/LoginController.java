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

@Controller
public class LoginController extends BaseController {
	
	@Autowired
	private LoginService	loginService;

	@RequestMapping("/login")
	public ModelAndView	login(HttpServletRequest request) {
		Object userSession = request.getSession().getAttribute("user");
		if (!EmptyUtil.isEmpty(userSession)) {
			return new ModelAndView("redirect:/landlord/home");
		}
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/register")
	public ModelAndView	register(HttpServletRequest request) {
		Object userSession = request.getSession().getAttribute("user");
		if (!EmptyUtil.isEmpty(userSession)) {
			return new ModelAndView("redirect:/landlord/home");
		}
		return new ModelAndView("login/register");
	}
	
	@RequestMapping("/login/submit")
	public String loginSubmit(HttpServletRequest request) {
		Map<String, Object> params = this.getParams(request);
		User user = this.loginService.loginSubmit(params);
		if (EmptyUtil.isEmpty(user)) {
			return "redirect:/login";
		}
		request.getSession().setAttribute("user", user);
		return "redirect:/landlord/home";
	}
	
	@ResponseBody
	@RequestMapping("/register/submit")
	public String registerSubmit(HttpServletRequest request) {
		return this.getParams(request).toString();
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return "redirect:/";
	}
}
