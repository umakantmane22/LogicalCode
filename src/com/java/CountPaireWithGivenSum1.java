package com.java;

import java.util.HashMap;
import java.util.Map;

public class CountPaireWithGivenSum1 {

	public static void main(String[] args) {
		int[] A = {4, 8, 7, 2, 5, 3, 1,5,6 };
        int target = 10;
 
        findPair(A, target);

	}
	// Function to find a pair in an array with a given sum using hashing
    public static void findPair(int[] A, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < A.length; i++)
        {
            // check if pair `(A[i], target-A[i])` exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(target - A[i]))
            {
                System.out.printf("Pair found (%d, %d)", A[map.get(target - A[i])], A[i]);
                return;
            }
 
            // store index of the current element in the map
            map.put(A[i], i);
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
}
