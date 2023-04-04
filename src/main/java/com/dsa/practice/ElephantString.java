package com.dsa.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElephantString {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int luckyStringsCount = sc.nextInt();
			int pillowStringsCount = sc.nextInt();
			sc.nextLine();
			List<String> luckyStrings = new ArrayList<>();
			List<String> pillowStrings = new ArrayList<>();
			for (int i = 0; i < luckyStringsCount; i++) {
				luckyStrings.add(sc.nextLine());
			}
			for (int i = 0; i < pillowStringsCount; i++) {
				pillowStrings.add(sc.nextLine());
			}

			for (String pillowString : pillowStrings) {
				boolean matchFound = false;
				if (pillowString.length() >= 47) {
					System.out.println("Good");
				} else {
					for (String luckyString : luckyStrings) {
						if (pillowString.contains(luckyString)) {
							matchFound = true;
							break;
						}
					}
					if(matchFound) {
						System.out.println("Good");
					} else {
						System.out.println("Bad");
					}
						
				}
			}
		}
	}
}
