package com.dsa.practice;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = {4,3,1,5,2};
		int[] res = selectionSort(nums);
		for(int num:res) {
			System.out.println(num);
		}

	}

	private static int[] selectionSort(int[] nums) {
		int len = nums.length-1;
		for(int i =0;i<nums.length;i++) {
			int maxIndex = findMax(nums,nums.length-i);
			int temp = nums[len];
			nums[len] = nums[maxIndex];
			nums[maxIndex] = temp;
			len--;
		}
		return nums;
	}

	private static int findMax(int[] nums, int len) {
		int res=0;
		for(int i =0;i<len;i++) {
			if(nums[res]<nums[i]) {
				res = i;
			}
		}
		return res;
	}

}
