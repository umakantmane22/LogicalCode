//How to swap two numbers without using a third variable?
package com.java;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//int a=10,b=20;
		swapNumberUsingThirdVariable(10,20);
		swapNumberWithoutUsingThirdVariable(100,200);

	}

	private static void swapNumberWithoutUsingThirdVariable(int a, int b) {
		System.out.println("swapNumberWithoutUsingThirdVariable...");
		System.out.println("Before Swapping");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);
		
		b=b+a; // b=20+10
		a=b-a; // a=30-10
		b=b-a; // b=30-20
		
		System.out.println("After Swapping WithoutUsingThirdVariable");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);

		

		
	}

	private static void swapNumberUsingThirdVariable(int a, int b) {
		System.out.println("swapNumberUsingThirdVariable...");
		System.out.println("Before Swapping");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);
		
		int temp=0;
		temp=a;  // temp= 10
		a=b;	// a=20
		b=temp; // b=10
		
		System.out.println("After Swapping UsingThirdVariable");
		System.out.println("Value of a is :" + a);
		System.out.println("Value of b is :" + b);
	}

}
