package com.prowings.everyday;

public class StarPattern {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=i;k++)
			System.out.print(k+" ");
		for(int j=i-1;j>=1;j--) {
			//count++;
			System.out.print(j+" ");
		}
		
	System.out.println();
	}
}
}
