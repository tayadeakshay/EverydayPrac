package com.prowings.everyday;

import java.util.Arrays;

public class IsInsertionSort {
	public static void main(String[] args) {
		int[] a= {3,2,5,4,6,1};
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
		{a[j]=a[j-1];
			j=j-1;
		}
			a[j]=temp;
		}
	System.out.println(Arrays.toString(a));
	}
	

}
