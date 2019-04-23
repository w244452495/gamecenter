package com.lx.gamecenter.controller.common;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lx.gamecenter.common.util.CacheUtil;
import com.lx.gamecenter.controller.base.BaseController;

/**
 * @Title:  RedisController.java   
 * @Package com.lx.gamecenter.controller   
 * @Description: redis查看
 * @author: Lixin
 * @date:   2019年3月30日 上午8:45:24   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Controller
@RequestMapping("/redis")
public class RedisController extends BaseController {
	
	/**
	 * @Title: queryByKey   
	 * @Description: 查看redis的值
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Object queryByKey(HttpServletRequest request) {
		String key = request.getParameter("key");
		return CacheUtil.get(key);
	}
}
