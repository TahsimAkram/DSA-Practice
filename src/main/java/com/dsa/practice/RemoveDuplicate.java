package com.dsa.practice;

public class RemoveDuplicate {
	public static void main(String []args) {
		int[] nums = {1,1,1,2,3,3,4,4,4,4,5,6,7,8,9,9};
		int size = removeDuplicates(nums);
		for(int i :nums) {
        	System.out.println(i);
        }
		
	}

	public static int removeDuplicates(int[] nums) {
       int i =0;
       for(int j=1;j<nums.length;j++) {
    	   if(nums[i]!=nums[j]) {
    		   i++;
    		   nums[i]=nums[j];
    	   }
       }
       return i+1;
    }
}
