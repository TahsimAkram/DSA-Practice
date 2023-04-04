package com.dsa.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LazySalesmam {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int testCase = sc.nextInt();
			while(testCase > 0) {
				int counter=0,sum = 0;
				int length = sc.nextInt();
				int wage = sc.nextInt();
				List<Integer> list = new ArrayList<>();
				for(int i=0;i<length;i++) {
					int val = sc.nextInt();
					list.add(val);
				}
				Collections.sort(list,(a,b)-> a > b ? -1:1);
				for(Integer value : list) {
					sum+=value;
					counter++;
					if(sum>=wage) {
						break;
					}
				}
				System.out.println(length-counter);
				testCase--;
			}
			
		}
	}
}
