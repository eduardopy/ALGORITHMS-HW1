package com.hw1.Q2;

public class BinarySearch {
	public static int binarysteps = 0;

	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while( lo <= hi )
		{
			binarysteps++;   // steps placed here so that it is incremented with every iteration
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;			
		}
		return -1;
	}
	
}
