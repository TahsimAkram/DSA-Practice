package com.dsa.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Infernos {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int testCase = sc.nextInt();
			while(testCase > 0) {
				int length = sc.nextInt();
				int power = sc.nextInt();
				List<Integer> list = new ArrayList<>();
				for(int i=0;i<length;i++) {
					int val = sc.nextInt();
					list.add(val);
				}
				Collections.sort(list);
				int singleTargetMode = list.get(list.size()-1);
				long maxTargetMode = 0;
				for(Integer integer : list) {
					maxTargetMode += integer%power==0? integer/power : (integer/power)+1;
				}
				System.out.println(Math.min(maxTargetMode, singleTargetMode));
				testCase--;
			}
		}
	}
}
