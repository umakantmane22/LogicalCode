/*
A palindrome string is one whose reverse is also the same string. 
So we can reverse the input string and check 
if both strings are equal or not. We can also use the 
String charAt(int index) method to check for palindrome string.
E.g. such as 16461 that remains the same when its digits are reversed.
*/

package com.java;

public class PalindromeNumber {

	public static void main(String[] args) {
		String inputValue = "16461";
		System.out.println(inputValue + "  is palindrome: " + checkPalindromeString(inputValue));
		inputValue = "RamRam";
		System.out.println(inputValue + "  is palindrome: " + checkPalindromeString(inputValue));
		inputValue = "OmO";
		System.out.println(inputValue + "  is palindrome: " + checkPalindromeString(inputValue));


	}

	private static boolean checkPalindromeString(String inputValue) {
		int lenght=inputValue.length();
		for(int i=0;i< lenght/2;i++) {
			if ( inputValue.charAt(i) != inputValue.charAt(lenght-i-1) ) {
				return false;
			}
			break;
		}
		return true;
	}

}
