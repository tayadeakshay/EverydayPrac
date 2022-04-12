package com.interview.arraypractice;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		int[] a = {4,2,0,5,1,0,6,3};
		int count = 0;
		int temp = 0;
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == 0)
				count++;
		}
		for(int i=1;i<=count;i++)
		{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j] == 0)
			{
			temp = a[j];
			}
			a[j] = a[j+1];
		}
		a[a.length-1] = temp;
		System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

}
