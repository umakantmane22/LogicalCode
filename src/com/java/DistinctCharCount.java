// How to get distinct characters and their count in a String?
package com.java;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharCount {

	public static void main(String[] args) {
		// String inputString = "abcdABCDabcd";
		String inputString = "Umakant Rajaram Mane";
		char[] chars = inputString.toCharArray();
		Map<Character, Integer> charsCount = new HashMap<>();
		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}
		System.out.println(charsCount); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
	}
}
