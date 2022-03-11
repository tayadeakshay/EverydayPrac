package com.prowings.everyday;

import java.util.Arrays;

public class IsBubbleSort {

	public static void main(String[] args) {

		int[] a = {5,2,3,4};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
			   temp=a[j];
			   a[j]=a[j+1];
			   a[j+1]=temp;
			   flag=1;
			   System.out.println("flag raised");
			}
		}
		if( flag==0) {
System.out.println("Loop break");
			break;}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
