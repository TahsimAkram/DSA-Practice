package com.dsa.practice;

import java.util.Arrays;
import java.util.List;

public class MountainArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,1,3);
		int target = 0;
		System.out.println(findInMountainArray(target, list));
		
	}

	public static int findInMountainArray(int target, List<Integer> mountainArr) {
		int res;
		int peak = findPeakIndex(mountainArr);
		if (mountainArr.get(peak) < target) {
			return -1;
		} else if (mountainArr.get(peak) == target) {
			return peak;
		} else {
			res = binarySearch(target, mountainArr, 0, peak - 1,false);
			if (res == -1) {
				res = binarySearch(target, mountainArr, peak + 1, mountainArr.size() - 1,true);
			}
		}
		return res;
	}

	public static int binarySearch(int target, List<Integer> mountainArr, int start, int end,boolean desc) {
		int mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (mountainArr.get(mid) > target) {
				if(desc) {
					end = mid + 1;
				}else {
					end = mid-1;
				}
			} else if (mountainArr.get(mid) < target) {
				if(desc) {
					start = mid - 1;
				}else {
					start = mid + 1;
				}
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int findPeakIndex(List<Integer> mountainArr) {
		int start = 0;
		int end = mountainArr.size() - 1;
		int mid = 0;
		while (start < end) {
			mid = (start + end) / 2;
			if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}
}
