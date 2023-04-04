package com.dsa.practice;

public class FirstAndLastPositionOfElementINSortedArray {
	
	public static void main(String[]args) {
		int[] sortedArray = {3,5,7,7,7,7,7,8,11,15,18,20,22,23,25,29,32,45,47,54,87,99};
		int start = searchRangeforIndex(sortedArray, 4, true);
		int end = searchRangeforIndex(sortedArray, 4, false);
		System.out.print(start+" "+end);
	}

	private static int searchRangeforIndex(int[] sortedArray, int target, boolean isFirstIndex) {
		int start =0;
		int end= sortedArray.length-1;
		int mid =0;
		int ans = -1;
		while(start<=end) {
			mid=(start+end)/2;
			if(target > sortedArray[mid]) {
				start =mid+1;

			}else if(target <sortedArray[mid]) {
				end = mid-1;
			}else {
				ans=mid;
				if(isFirstIndex) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			
		}
		return ans;
	}

	
}

