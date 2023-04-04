package com.dsa.practice;

import java.util.Scanner;

public class MakeMultiple {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int testCase = sc.nextInt();
			while(testCase > 0) {
				long first = sc.nextLong();
				long second = sc.nextLong();
				if(first==second || second%first ==0)
					System.out.println("Yes");
				else {
					long diff = second-first;
					if(diff > first) {
						System.out.println("Yes");
					}
					else {
						System.out.println("No");
					}
				}
				testCase--;
			}
		}
	}
}
