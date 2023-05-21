package com.dsa.practice;

public class SortPeople {
	public static void main(String[] args) {
		String []names = {"Mary","John","Emma"};
		int[] heights = {180,165,170}; 
        int[] sortedHeight = bubbleSort(heights);
        String[] sortedNames = sortName(names,sortedHeight,heights);
        for(String name: sortedNames) {
        	System.out.println(name);
        }
    }
    public static int[] bubbleSort(int[] heights){
        int len = heights.length;
        int[] height = new int[len];
        System.arraycopy(heights, 0, height, 0, len);
        for(int i=0;i<len;i++){
            for(int j=1;j<len-i;j++){
                if(height[j-1] < height[j]){
                    int temp = height[j-1];
                    height[j-1] = height[j];
                    height[j] = temp;
                }
            }
        }
        return height;
    }

    public static String[] sortName(String[] names,int[] sortedHeight,int[] heights){
        int len = names.length;
        String[] sortedName = new String[len];
        for(int i =0;i<len;i++){
            int index = binarSearch(sortedHeight,heights[i]);
            sortedName[index] = names[i];
        }
        return sortedName;
    }

    public static int binarSearch(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        int mid =0;
        while(start<=end){
            mid = start + ((end-start)/2);
            if(array[mid] < target){
                end = mid-1;
            }else if(array[mid] > target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

