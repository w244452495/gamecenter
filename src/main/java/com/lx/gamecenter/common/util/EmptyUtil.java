package com.lx.gamecenter.common.util;

import java.util.Map;

public class EmptyUtil {

	public static boolean isEmpty(Map<?, ?> map) {
		return null == map || map.isEmpty();
	}
	
	public static boolean isEmpty(String string) {
		return null == string || "".equals(string);
	}
}
