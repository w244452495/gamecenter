package com.lx.gamecenter.interceptor;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * @Title:  GameCenterWebSocketHandsharkInterceptor.java   
 * @Package com.lx.gamecenter.interceptor   
 * @Description: websocket请求回话拦截器
 * @author: Lixin
 * @date:   2019年3月15日 下午11:02:01   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
public class GameCenterWebSocketHandsharkInterceptor extends HttpSessionHandshakeInterceptor {

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
		System.out.println("===============before interceptor=============== " + attributes);
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}
	
	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
		System.out.println("===============before interceptor=============== ");
		super.afterHandshake(request, response, wsHandler, ex);
	}
}