package com.lx.gamecenter.controller.fightLandlord;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lx.gamecenter.controller.base.BaseController;

@Controller
@RequestMapping("/landlord")
public class FightLandlordController extends BaseController {

	@RequestMapping("/home")
	public ModelAndView homePage(HttpServletRequest request) {
		return new ModelAndView("/landload/home");
	}
}
