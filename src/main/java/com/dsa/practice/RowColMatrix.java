package com.dsa.practice;

public class RowColMatrix {
	public static void main(String[]args) {
		int[][]matrix = {{12,14,17,28},{13,19,34,49},{20,25,36,53},{35,46,66,86}};
		int target = 14;
		int [] res = findIndex(matrix,target);
		System.out.println(res[0]+" "+res[1]);
	}
	
	public static int[] findIndex(int[][]arr,int target) {
		int[] res = {-1,-1};
		int row = 0;
		int col = arr.length-1;
		while(row<arr.length && col>=0) {
			if(target > arr[row][col]) {
				row++;
			}else if(target < arr[row][col]) {
				col--;
			}else {
				res[0]=row;
				res[1]=col;
				return res;
			}
		}
		return res;
	}
}