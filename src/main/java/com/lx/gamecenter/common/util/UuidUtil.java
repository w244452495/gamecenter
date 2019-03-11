package com.lx.gamecenter.common.util;

import java.util.Random;

public class UuidUtil {

	public static String getUuid() {
		Random r = new Random();
		String randomInt = Integer.toString(r.nextInt(1000000));
		while(randomInt.length() < 6) {
			randomInt += "0";
		}
		return System.currentTimeMillis() + "" + randomInt;
	}
	
}
