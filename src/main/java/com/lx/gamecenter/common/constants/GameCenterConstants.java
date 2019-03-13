package com.lx.gamecenter.common.constants;

import java.util.HashMap;
import java.util.Map;

import com.lx.gamecenter.entity.fightLandlord.Poker;

public class GameCenterConstants {

	public static final String LOGIN_SESSION_REPFIX = "loginSession_";
	
	public static final Map<Integer, Poker> POKER_ENTITY_MAP = new HashMap<>();
	
	static {
		POKER_ENTITY_MAP.put(1, new Poker(1, 3, "♠3"));
		POKER_ENTITY_MAP.put(2, new Poker(2, 3, "♥3"));
		POKER_ENTITY_MAP.put(3, new Poker(3, 3, "♣3"));
		POKER_ENTITY_MAP.put(4, new Poker(4, 3, "♦3"));
		POKER_ENTITY_MAP.put(5, new Poker(5, 4, "♠4"));
		POKER_ENTITY_MAP.put(6, new Poker(6, 4, "♥4"));
		POKER_ENTITY_MAP.put(7, new Poker(7, 4, "♣4"));
		POKER_ENTITY_MAP.put(8, new Poker(8, 4, "♦4"));
		POKER_ENTITY_MAP.put(9, new Poker(9, 5, "♠5"));
		POKER_ENTITY_MAP.put(10, new Poker(10, 5, "♥5"));
		POKER_ENTITY_MAP.put(11, new Poker(11, 5, "♣5"));
		POKER_ENTITY_MAP.put(12, new Poker(12, 5, "♦5"));
		POKER_ENTITY_MAP.put(13, new Poker(13, 6, "♠6"));
		POKER_ENTITY_MAP.put(14, new Poker(14, 6, "♥6"));
		POKER_ENTITY_MAP.put(15, new Poker(15, 6, "♣6"));
		POKER_ENTITY_MAP.put(16, new Poker(16, 6, "♦6"));
		POKER_ENTITY_MAP.put(17, new Poker(17, 7, "♠7"));
		POKER_ENTITY_MAP.put(18, new Poker(18, 7, "♥7"));
		POKER_ENTITY_MAP.put(19, new Poker(19, 7, "♣7"));
		POKER_ENTITY_MAP.put(20, new Poker(20, 7, "♦7"));
		POKER_ENTITY_MAP.put(21, new Poker(21, 8, "♠8"));
		POKER_ENTITY_MAP.put(22, new Poker(22, 8, "♥8"));
		POKER_ENTITY_MAP.put(23, new Poker(23, 8, "♣8"));
		POKER_ENTITY_MAP.put(24, new Poker(24, 8, "♦8"));
		POKER_ENTITY_MAP.put(25, new Poker(25, 9, "♠9"));
		POKER_ENTITY_MAP.put(26, new Poker(26, 9, "♥9"));
		POKER_ENTITY_MAP.put(27, new Poker(27, 9, "♣9"));
		POKER_ENTITY_MAP.put(28, new Poker(28, 9, "♦9"));
		POKER_ENTITY_MAP.put(29, new Poker(29, 10, "♠10"));
		POKER_ENTITY_MAP.put(30, new Poker(30, 10, "♥10"));
		POKER_ENTITY_MAP.put(31, new Poker(31, 10, "♣10"));
		POKER_ENTITY_MAP.put(32, new Poker(32, 10, "♦10"));
		POKER_ENTITY_MAP.put(33, new Poker(33, 11, "♠J"));
		POKER_ENTITY_MAP.put(34, new Poker(34, 11, "♥J"));
		POKER_ENTITY_MAP.put(35, new Poker(35, 11, "♣J"));
		POKER_ENTITY_MAP.put(36, new Poker(36, 11, "♦J"));
		POKER_ENTITY_MAP.put(37, new Poker(37, 12, "♠Q"));
		POKER_ENTITY_MAP.put(38, new Poker(38, 12, "♥Q"));
		POKER_ENTITY_MAP.put(39, new Poker(39, 12, "♣Q"));
		POKER_ENTITY_MAP.put(40, new Poker(40, 12, "♦Q"));
		POKER_ENTITY_MAP.put(41, new Poker(41, 13, "♠K"));
		POKER_ENTITY_MAP.put(42, new Poker(42, 13, "♥K"));
		POKER_ENTITY_MAP.put(43, new Poker(43, 13, "♣K"));
		POKER_ENTITY_MAP.put(44, new Poker(44, 13, "♦K"));
		POKER_ENTITY_MAP.put(45, new Poker(45, 14, "♠A"));
		POKER_ENTITY_MAP.put(46, new Poker(46, 14, "♥A"));
		POKER_ENTITY_MAP.put(47, new Poker(47, 14, "♣A"));
		POKER_ENTITY_MAP.put(48, new Poker(48, 14, "♦A"));
		POKER_ENTITY_MAP.put(49, new Poker(49, 15, "♠2"));
		POKER_ENTITY_MAP.put(50, new Poker(50, 15, "♥2"));
		POKER_ENTITY_MAP.put(51, new Poker(51, 15, "♣2"));
		POKER_ENTITY_MAP.put(52, new Poker(52, 15, "♦2"));
		POKER_ENTITY_MAP.put(53, new Poker(53, 16, "小"));
		POKER_ENTITY_MAP.put(54, new Poker(54, 17, "大"));
	}
	
}
