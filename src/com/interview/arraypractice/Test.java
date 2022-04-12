package com.interview.arraypractice;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 7, 2, 8 };

		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 5));
		int[] b	= Arrays.copyOf(a,3);
		System.out.println(Arrays.toString(b));
		int[] c = Arrays.copyOfRange(a, 0, 3);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.equals(b, c));

		List<int[]> d = Arrays.asList(c);
		
		
		for(int[] e:d)
			System.out.println(Arrays.toString(e));
		

	}

}
