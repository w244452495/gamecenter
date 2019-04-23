package com.lx.gamecenter.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.lx.gamecenter.interceptor.GameCenterWebSocketHandsharkInterceptor;
import com.lx.gamecenter.websocket.handler.GameWebSocketHandler;

/**
 * 
 * @Title:  GameCenterWebsocketConfig.java   
 * @Package com.lx.gamecenter.websocket.config   
 * @Description: WebSocket配置类
 * @author: Lixin
 * @date:   2019年3月15日 下午11:08:03   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class GameCenterWebsocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// 注册websocket处理类，访问url，设置拦截器
		registry.addHandler(getHandler(), "/gameCenterWebSocket.action").addInterceptors(new GameCenterWebSocketHandsharkInterceptor());
		// 当用sockjs来代替websocket时，请求url会自动加上info
		registry.addHandler(getHandler(), "/sockjs/gameCenterWebSocket/info").addInterceptors(new GameCenterWebSocketHandsharkInterceptor()).withSockJS();
	}
	
	@Bean
	public GameWebSocketHandler getHandler() {
		return new GameWebSocketHandler();
	}

}
