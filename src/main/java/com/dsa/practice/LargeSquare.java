package com.dsa.practice;

import java.util.Scanner;

public class LargeSquare {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int testCase = sc.nextInt();
			while(testCase > 0) {
				int squares = sc.nextInt();
				int sidesLength = sc.nextInt();
				int max=0;
				for(int i=1;i<=squares;i++) {
					if(i*i >max && i*i <=squares ) {
						max = i;
					}
					else {
						break;
					}
				}
				System.out.println(max*sidesLength);
				testCase--;
			}
		}
	}
}
