/*
 * 
Input:
 
nums = [8, 7, 2, 5, 3, 1]
target = 10
 
Output:
 
Pair found (8, 2)
or
Pair found (7, 3)
 
 
Input:
nums = [5, 2, 6, 8, 1, 9]
target = 12
 
Output: Pair not found
 */
package com.dsa.practice;

import java.util.Map;
import java.util.TreeMap;

public class Findsum {
	public static void main(String[]args) {
		int[] sample = {5,6,8,2,9,0};
		int target = 1;
		findPairSum(sample,target);
	}

	private static void findPairSum(int[] sample, int target) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Map<Integer,Integer> integerMap = new TreeMap<Integer,Integer>();
		for(int i=0;i<sample.length;i++) {
			if(integerMap.containsKey(target-sample[i])) {
				System.out.println("Pair: "+sample[i]+","+ sample[integerMap.get(target - sample[i])]);
				flag=true;
			}
			else {
				integerMap.put(sample[i], i);
			}
		}
		if(!flag) {
			System.out.println("No pair Found");
		}
		
	}

}
