package com.prowings.everyday;

import java.util.Arrays;

public class IsSelectionSort {
	public static void main(String[] args) {
		
	
	String[] a = {"ak","rh","ja","ka"};
	int min;
	String temp="";
	
	for(int i=0;i<a.length;i++)
	{
		min=i;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[j].compareTo(a[min])<0)
		min=j;
	}
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	
	}
System.out.println(Arrays.toString(a));
}}
