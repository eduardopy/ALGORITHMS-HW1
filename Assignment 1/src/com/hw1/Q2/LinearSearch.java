package com.hw1.Q2;

public class LinearSearch {
	public static long linearsteps = 0;

	public static int rank(int key, int[] a) {
		
		for(int i = 0; i < a.length; i++) {
			linearsteps++;  //since it is a linear search we just need to increase the step each time this loop runs
			if (a[i] == key)
				return i;
		}
		return -1;
	}
}
