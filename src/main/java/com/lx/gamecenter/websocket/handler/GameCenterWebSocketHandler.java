package com.lx.gamecenter.websocket.handler;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @Title:  GameCenterWebSocketHandler.java   
 * @Package com.lx.gamecenter.websocket   
 * @Description: websocket消息处理类
 * @author: Lixin
 * @date:   2019年3月15日 下午10:56:32   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
public class GameCenterWebSocketHandler extends TextWebSocketHandler {
	
	public static final Map<String, WebSocketSession> USER_MAP = new HashMap<>();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		String sessionId = session.getId();
		System.out.println("连接成功：" + sessionId);
		USER_MAP.put(sessionId, session);
		System.out.println(USER_MAP);
		super.afterConnectionEstablished(session);
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		for (Entry<String, WebSocketSession> user : USER_MAP.entrySet()) {
			System.out.println(session.getId() + "发送消息：" + message);
			user.getValue().sendMessage(message);
		}
	}


	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		super.handleTransportError(session, exception);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		String sessionId = session.getId();
		System.out.println("退出成功：" + sessionId);
		USER_MAP.remove(sessionId);
		super.afterConnectionClosed(session, status);
	}

}
