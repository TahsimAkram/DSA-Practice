package com.dsa.practice;

public class BasicBinarySearchCielengCharachter {
	public static void main(String []args) {
		char[] charArray= {'c','f','j'};
		System.out.println(nextGreatestLetter(charArray, 'g'));
		
	}
	public static char nextGreatestLetter(char[] letters, char target) {
	       int startIndex =0;
			int endIndex = letters.length-1;
			int midIndex=0;
				if(target >= letters[endIndex-1] || target < letters[startIndex]) {
					return letters[startIndex];
				}
			while(startIndex<=endIndex) {
				midIndex = (startIndex)+((endIndex-startIndex)/2);
				if(letters[midIndex] <= target) {
					startIndex = midIndex+1;
				} else if(letters[midIndex] > target) {
					endIndex = midIndex-1;
				} 
			}
	        return letters[startIndex];
		}
}
