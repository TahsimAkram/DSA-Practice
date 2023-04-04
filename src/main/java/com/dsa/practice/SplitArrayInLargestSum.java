package com.dsa.practice;

public class SplitArrayInLargestSum {
	public static void main(String []args) {
		int[] arr = {7,2,5,8,10};
		int m =2;
		System.out.println(search(arr,m));
	}

	private static int search(int[] arr, int m) {
		int start =0;
		int end=0;
		int mid=0;
		for(int i =0;i<arr.length;i++) {
			start = Math.max(start, arr[i]);
			end+=arr[i];
		}
		while(start<end) {
			int sum=0;
			int peice =1;
			mid=(start+end)/2;
			for(int element : arr) {
				if(sum+element > mid) {
					sum = element;
					peice++;
				}else {
					sum+=element;
				}
			}
			if(peice > m) {
				start = mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}
}
