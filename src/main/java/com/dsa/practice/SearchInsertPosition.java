package com.dsa.practice;

public class SearchInsertPosition {
	
		public static void main(String []args) {
			int[] sortedArray = {1,3};
			System.out.println(searchInsert(sortedArray, 2));
		}
	    public static int searchInsert(int[] nums, int target) {
	        int start =0;
	        int end = nums.length-1;
	        int mid =0;
	        if(nums[start] > target) {
	        	return 0;
	        }
	        if(nums[end-1] <= target) {
	        	return end;
	        }
	        while(start<=end){
	            mid = (start+end)/2;
	            if(nums[mid] > target){
	                end = mid-1;
	            }else if(nums[mid] < target){
	                start=mid+1;
	            }
	            else {
	                return mid;
	            }
	        }
	        return start;
	    }
}
