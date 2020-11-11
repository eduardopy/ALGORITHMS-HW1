package com.hw1.Q2;

public class BinarySearchRecursive {
	
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}
	public static int binaryrecursivesteps = 0;

	public static int rank(int key, int[] a, int lo, int hi) {
		if( lo > hi ) return -1;
		binaryrecursivesteps++;  //placed steps here so that whenever a search happens the counter increases
		int mid = lo + (hi - lo) / 2;
		
		if( key < a[mid]) return rank(key, a, lo, mid-1);
		
		else if(key > a[mid]) return rank(key, a, mid+1, hi);
		
		else return mid;
	}
	
	
}
