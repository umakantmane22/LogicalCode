package com.java;

import java.util.Iterator;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int inputArry[]= {1,6,2,5,3,4};
		int sumOffAllEle=0;
		for (int i : inputArry) {
			sumOffAllEle=sumOffAllEle+i;
		}
		System.out.println("Sum=>"+sumOffAllEle);

	}

}
