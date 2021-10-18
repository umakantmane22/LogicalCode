package com.java;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		//int inputArray[]= {110,150,12,2,06,1,60,50,100,99,0};
		int inputArray[] = { 40, 10, 20, 99,98,20, 30, 30, 40, 50, 50 };
		/*
		 * System.out.println("Third second largest number is::=>"
		 * +findSecondLargestNumber(inputArray));
		 */
	int outPut= findSecondLargestNumber(inputArray);
	System.out.println("output number is::=>"+outPut);
	}

	private static int findSecondLargestNumber(int[] inputArray) {
		System.out.println("First  methode....");
		int temp=0;
		int size=inputArray.length;
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				 if (inputArray[i]>inputArray[j]) {
					temp=inputArray[i];
					inputArray[i]=inputArray[j];
					inputArray[j]=temp;
				}
				
			}
		}
		System.out.println("modify inputArray::");
		System.out.println(Arrays.toString(inputArray)); 
		/*
		for (int i : inputArray) {
			System.out.println(i);
		}
		*/
		System.out.println("Largest second largest number is::=>"+inputArray[size-1]);
		System.out.println("Second Largest largest number is::=>"+inputArray[size-2]);
		System.out.println("Third Largest number is::=>"+inputArray[size-3]);
		System.out.println("Fourth Largest number is::=>"+inputArray[size-4]);
/*---------------------------------------------------------------------*/		
		System.out.println("Second  methode....");
		Arrays.sort(inputArray);
		System.out.println("sorted Array ::"+Arrays.toString(inputArray));
	      int res = inputArray[size-2];
	      System.out.println("2nd largest element is ::"+res);
		
		return inputArray[size-1]; //for larget 1rd	
		
	}

}
