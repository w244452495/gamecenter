package com.lx.gamecenter.controller.table;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.lx.gamecenter.controller.base.BaseController;
import com.lx.gamecenter.entity.table.Table;
import com.lx.gamecenter.service.game.intf.GameService;
import com.lx.gamecenter.service.table.intf.TableService;

/**
 * @Title:  TableController.java   
 * @Package com.lx.gamecenter.controller.table   
 * @Description: 桌子管理
 * @author: Lixin
 * @date:   2019年3月17日 下午8:24:59   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Controller
@RequestMapping("/table")
public class TableController extends BaseController {
	
	@Autowired
	private TableService	tableService;
	
	@Autowired
	private GameService		gameService;
	
	/**
	 * @Title: homePage   
	 * @Description: 进入桌子主页面
	 * @param: @param request
	 * @param: @return      
	 * @return: ModelAndView      
	 * @throws
	 */
	@RequestMapping("/home")
	public ModelAndView homePage(HttpServletRequest request) {
		Map<String, Object> paramMap = this.getParams(request);
		ModelAndView mv = new ModelAndView("table/home");
		mv.addObject("gameId", paramMap.get("id"));
		mv.addObject("gameName", this.gameService.queryGameNameById(paramMap));
		return mv;
	}
	
	/**
	 * @Title: queryTableListByGameId   
	 * @Description: 获取所有桌子列表
	 * @param: @param request
	 * @param: @return      
	 * @return: List<Table>      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/queryTableListByGameId")
	public List<Table> queryTableListByGameId(HttpServletRequest request) {
		Map<String, Object> paramMap = this.getParams(request);
		// 根据游戏id获取所有桌子列表
		return this.tableService.queryTableListByGameId(paramMap);
	}
	
}
