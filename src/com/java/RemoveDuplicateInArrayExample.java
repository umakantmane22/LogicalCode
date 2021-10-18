package com.java;

import java.util.Arrays;

public class RemoveDuplicateInArrayExample {

	public static void main(String[] args) {
		int arr[] = { 40, 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		// Arrays.sort(arr);//sorting array
		// first we need to sort for unsorted array
		sortArrayAlgoritham(arr);
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
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

	public static int removeDuplicateElements(int arr[], int length) {
		if (length == 0 || length == 1) {
			return length;
		}
		int[] temp = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[length - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
}
