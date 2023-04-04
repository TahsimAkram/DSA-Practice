package com.dsa.practice;

public class FindElementInSortedInfiniteArray {
	public static void main(String []args) {
		
	}
	public static int findIndex(int[] nums,int target) {
		int start = 0;
		int end = 5;
		while(true) {
			if(nums[start]<=target && nums[end]>=target) {
				break;
			}else {
				start = end+1;
				end = end + (end*2);
			}
		}
		return executeBinarySearch(nums, target, start, end);
	}
	public static int executeBinarySearch(int[] nums,int target,int start,int end) {
		int mid=0;
		int res=-1;
		while(start<=end) {
			mid=(start+end)/2;
			if(nums[mid] > target) {
				end=mid-1;
			}else if(nums[mid] < target) {
				start=mid+1;
			}else {
				res = nums[mid];
			}
		}
		return res;
	}
}
