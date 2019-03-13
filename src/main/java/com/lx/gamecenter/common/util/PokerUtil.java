package com.lx.gamecenter.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lx.gamecenter.common.constants.GameCenterConstants;

public class PokerUtil {

	public static List<Integer> getPokerIdList() {
		List<Integer> pokerIdList = new ArrayList<>();
		for (int i = 1; i < 55; i++) {
			pokerIdList.add(i);
		}
		return pokerIdList;
	}
	
	public static Map<String, List<Integer>> diapatchPoker(List<Integer> pokerIdList) {
		Map<String, List<Integer>> userPoker = new HashMap<>();
		Collections.shuffle(pokerIdList);
		Collections.shuffle(pokerIdList);
		Collections.shuffle(pokerIdList);
		List<Integer> user1Poker = new ArrayList<>();
		List<Integer> user2Poker = new ArrayList<>();
		List<Integer> user3Poker = new ArrayList<>();
		List<Integer> bottomPoker = new ArrayList<>();
		for(int i = 0; i < pokerIdList.size(); i++) {
			if(i < 51) {
				if(0 == i % 3) {
					user1Poker.add(pokerIdList.get(i));
				} else if (1 == i % 3) {
					user2Poker.add(pokerIdList.get(i));
				} else {
					user3Poker.add(pokerIdList.get(i));
				}
			} else {
				bottomPoker.add(pokerIdList.get(i));
			}
		}
		Collections.sort(user1Poker);
		Collections.sort(user2Poker);
		Collections.sort(user3Poker);
		userPoker.put("user1", user1Poker);
		userPoker.put("user2", user2Poker);
		userPoker.put("user3", user3Poker);
		userPoker.put("bottom", bottomPoker);
		return userPoker;
	}

	
	public static void main(String[] args) {
		List<Integer> pokerIdList = getPokerIdList();
		Map<String, List<Integer>> maps = diapatchPoker(pokerIdList);
		maps.entrySet().forEach(map -> {
			StringBuilder builder = new StringBuilder(map.getKey() + " poker is 【");
			List<Integer> pokerList = map.getValue();
			pokerList.forEach(poker -> {
				builder.append(GameCenterConstants.POKER_ENTITY_MAP.get(poker).getPokerDesc()).append(" ");
			});
			builder.append("】");
			System.out.println(builder.toString());
		});
	}
}
