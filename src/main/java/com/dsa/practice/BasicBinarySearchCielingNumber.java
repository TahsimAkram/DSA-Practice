package com.dsa.practice;

public class BasicBinarySearchCielingNumber {
	public static void main(String []args) {
		int[] sortedArray = {3,5,8,11,15,18,20,22,23,25,29,32,45,47,54,67,87,99};
		System.out.println(search(sortedArray, 40));
		
	}
	public static Integer search(int[] sortedArray,int target) {
		int startIndex =0;
		int endIndex = sortedArray.length;
		int midIndex=0;
		while(startIndex<=endIndex) {
			midIndex = (startIndex+endIndex)/2;
			if(sortedArray[midIndex] < target) {
				startIndex = midIndex+1;
			} else if(sortedArray[midIndex] > target){
				endIndex = midIndex-1;
			} else {
				return midIndex;
			}
		}
		if(sortedArray[midIndex] >= target) {
			return midIndex;
		}else
			return midIndex+1;
	}
}
