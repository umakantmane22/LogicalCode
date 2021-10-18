// Note: A number which is not divisible by 2 that is called odd number
// e.g. -5, -3, -1, 1, 3, 5 , 7 , 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, etc.
package com.java;

import java.util.ArrayList;

public class OddNumberChecking {

	public static void main(String[] args) {

		int number = 0;
		number = 7;
		System.out.println(number + ": " + isOddNumber(number)); // true
		number = 9;
		System.out.println(number + ": " + isOddNumber(number)); // false
		number = 0;
		System.out.println(number + ": " + isOddNumber(number)); // false
		number = 2;
		System.out.println(number + ": " + isOddNumber(number)); // true
		number = 1;
		System.out.println(number + ": " + isOddNumber(number)); // true

		System.out.println("All odd number below 100=> " + allOddNumbers(100));
	}

	private static ArrayList<Integer> allOddNumbers(int input) {
		ArrayList<Integer> allOddNumbers = new ArrayList<>();
		for (int i = -10; i < input; i++) {
			if (isOddNumber(i)) {
				allOddNumbers.add(i);
			}
		}
		return allOddNumbers;
	}

	private static Boolean isOddNumber(int number) {
		if (!(number % 2 == 0)) {
			return true;
		}
		return false;
	}

}
