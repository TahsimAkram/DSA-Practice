package com.dsa.practice;

public class RotationCount {
	public static void main(String[]args) {
		int[] list = {7,9,11,12,13};
		int peak = findPivotPoint(list);
		System.out.println(peak+1);
	}

	private static int findPivotPoint(int[] list) {
		int start =0;
		int end = list.length-1;
		int mid=0;
		while(start<end) {
			mid = (start+end)/2;
			if(list[start] > list[mid]) {
				end=mid-1;
			}else if(list[mid] < list[mid+1]) {
				start = mid+1;
			}else {
				return mid ;
			}
		}
		return start;
		
	}

	
}
