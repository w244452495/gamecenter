package com.lx.gamecenter.controller.fightLandlord;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lx.gamecenter.controller.base.BaseController;

/**
 * @Title:  FightLandlordController.java   
 * @Package com.lx.gamecenter.controller.fightLandlord   
 * @Description: 斗地主管理
 * @author: Lixin
 * @date:   2019年3月17日 下午8:27:07   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Controller
@RequestMapping("/landlord")
public class FightLandlordController extends BaseController {
	
	/**
	 * @Title: table   
	 * @Description: 进入斗地主主页面
	 * @param: @param request
	 * @param: @return      
	 * @return: ModelAndView      
	 * @throws
	 */
	@RequestMapping("")
	public ModelAndView table(HttpServletRequest request) {
		return new ModelAndView("/landlord/pokerTable");
	}
}
