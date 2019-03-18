package com.lx.gamecenter.controller.game;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lx.gamecenter.controller.base.BaseController;
import com.lx.gamecenter.entity.game.Game;
import com.lx.gamecenter.service.game.intf.GameService;

/**
 * @Title:  GameController.java   
 * @Package com.lx.gamecenter.controller.game   
 * @Description: 游戏管理
 * @author: Lixin
 * @date:   2019年3月17日 下午8:27:19   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Controller
@RequestMapping("/game")
public class GameController extends BaseController {
	
	@Autowired
	private GameService gameService;
	
	/**
	 * @Title: queryGameList   
	 * @Description: 获取游戏列表
	 * @param: @return      
	 * @return: List<Game>      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/queryGameList")
	public List<Game> queryGameList() {
		return this.gameService.queryGameList();
	}
}
