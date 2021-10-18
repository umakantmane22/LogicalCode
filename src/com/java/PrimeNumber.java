/*
The number 11 is divisible only by 1 and the number itself. 
For a number to be classified as a prime number,
The first 25 prime numbers (all the prime numbers less than 100) 
are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 
67, 71, 73, 79, 83, 89, 97
*/

package com.java;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 0;
		number = 7;
		System.out.println(number + ": " + isPrime(number)); // true
		number = 9;
		System.out.println(number + ": " + isPrime(number)); // false
		number = 0;
		System.out.println(number + ": " + isPrime(number)); // false
		number = 2;
		System.out.println(number + ": " + isPrime(number)); // true
		number = 1;
		System.out.println(number + ": " + isPrime(number)); // true
		
		System.out.println("All prime number below 100=> "+allPrimeNumbers(100));

	}

	private static ArrayList<Integer> allPrimeNumbers(int input) {
		
		ArrayList<Integer> allPrimeNumbers = new ArrayList<>();
		for(Integer i=0;i<=input;i++) {
			boolean a=isPrime(i);
			if(isPrime(i)) {
				allPrimeNumbers.add(i);
			}
		}
		return allPrimeNumbers;
	}

	public static boolean isPrime(int number) {
		int temp = 0;
		if (number == 0 || number == 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				temp = temp + 1;
			}
		}

		if (temp > 0)
			return false;
		else
			return true;
	}

}
