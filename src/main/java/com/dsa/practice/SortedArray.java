package com.dsa.practice;

public class SortedArray {
	public static void main(String[]args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[] res = findIndex(matrix, 11);
		System.out.println(res[0]+" "+res[1]);
		
	}
	public static int[] findIndex(int[][] matrix,int target) {
		int row = matrix.length;
		int col = matrix[0].length-1;
		if(row == 1 ) {
			return BinarySearch(matrix,0,0,matrix[0].length-1,target);
		}
		
		int rStart = 0;
		int rEnd = matrix.length-1;
		int cMid = col/2;
		int rMid =0;
		while(rStart<=rEnd) {
			rMid = (rStart+rEnd)/2;
			if(matrix[rMid][cMid] == target) {
				return new int[] {rMid,cMid};
			}
			else if(matrix[rMid][cMid] < target) {
				rStart = rMid;
			}
			else {
				rEnd = rMid;
			}
		}
		
		int[] res =  BinarySearch(matrix, rStart, 0, matrix[rStart].length-1, target);
		if(res[0] == -1) {
			res =  BinarySearch(matrix, rEnd, 0, matrix[rEnd].length-1, target);
		}
		return res;
		
	}
	private static int[] BinarySearch(int[][] matrix, int row, int rEnd, int rStart, int target) {
		int mid =0;
		while(rStart<=rEnd) {
			mid =rStart+(rEnd-rStart)/2;
			if(matrix[row][mid] < target) {
				rStart = mid+1;
			}else if(matrix[row][mid] > target) {
				rEnd=mid-1;
			}else {
				return new int[] {row,mid};
			}
		}
		return new int[] {-1,-1};
	}
}
