package com.dsa.practice;

public class BasicBinarySearch {
	public static void main(String []args) {
		int[] sortedArray = {1,2,3,4,5,6,7,8,9};
//				,11,12,13,14,15,16,17,18,19,20};
		System.out.println(search(sortedArray, 0));
		
	}
	public static Integer search(int[] sortedArray,int target) {
		int startIndex =0;
		int endIndex = sortedArray.length;
		int midIndex;
		while(startIndex<=endIndex) {
			midIndex = (startIndex+endIndex)/2;
			if(sortedArray[midIndex] < target) {
				startIndex = midIndex+1;
			} else if(sortedArray[midIndex] > target){
				endIndex = midIndex-1;
			} else {
				return midIndex+1;
			}
			
		}
		return -1;
	}
}
