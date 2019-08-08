package com.usn.patterns.zchallenge;

import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers 
// Print the indices of two numbers that sum up to a target number
// Assume 1 : One number can be used only once 
// Assume 2 : Only one pair exists in the array that adds up to target

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = new int[] { -2, 3, 4, -5, 7, -9, 12};
		int target = 10;
		
		int[] result = getTwoSum(numArray, target);
		System.out.println(" Array is " + Arrays.toString(numArray) +", Target : " + target);
		System.out.println(" Array indices whose value add up to Target " + Arrays.toString(result));
	}

	private static int[] getTwoSum(int[] numArray, int target) {

		HashMap<Integer, Integer> visitedNums = new HashMap<>();

		for (int i=0; i < numArray.length; i++) {

			int delta = target - numArray[i]; 

			if (visitedNums.containsKey(delta)) {
				return new int[] {visitedNums.get(delta), i};
			}
			visitedNums.put(numArray[i], i);
		}
		return new int[] {-1, -1};
	}

}
