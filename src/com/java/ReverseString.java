package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String inputString = "123"; // UmakantMane
		System.out.println("Reverse of given string=> " + reverse(inputString));
	}

	public static String reverse(String inputString) {
		if (inputString == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder outPutString = new StringBuilder();

		char[] chars = inputString.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			outPutString.append(chars[i]);

		return outPutString.toString();

	}

}
