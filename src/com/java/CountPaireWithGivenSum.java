// https://www.geeksforgeeks.org/count-pairs-with-given-sum/
package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountPaireWithGivenSum {

	public static void main(String[] args) {
		// int[] arr = { 1, 5, 7, -1, 5 };
		// int[] arr = {4, 8, 7, 2, 5, 3, 1,5,6 };
		// int sum = 6;

		int[] arr = { 4, 8, 7, 2, 5, 3, 1, 5, 6, -90, 100 };
		int sum = 10;
		System.out.println("inputArray for sum:: "+10 +" is ::"+
		Arrays.toString(arr));
		getPairsCount(arr, sum);
		findPair(arr, sum);

	}

	public static void getPairsCount(int[] arr, int sum) {

		int count = 0; // Initialize result

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == sum)
					count++;

		System.out.println("Count of pairs is::" + count +" for sum: "+sum);
	}

	private static void findPair(int[] arr, int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println("Pair with given "
						+ "sum :" + sum + " is =>"
								+ "(" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
/*
		int count = 1;
		// create an empty HashMap
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					// map.put(arr[i], arr[j]);
					map.put(count, "==> " + "[" + arr[i] + " " + arr[j] + "]");
					count++;
				}

			}
		}
		System.out.println("Pairs::" + map);
*/
	}

}
