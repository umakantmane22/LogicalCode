package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// int inputArray[]= {168,1,862,7,152,0,74,21};
		int inputArray[] = { 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1 };
		sortArrayAlgoritham(inputArray);
	}

	private static void sortArrayAlgoritham(int[] inputArray) {
		System.out.println("Original array:" + Arrays.toString(inputArray));
		int temp = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}

		}
		System.out.println("Sorted array:" + Arrays.toString(inputArray));
	}

}
