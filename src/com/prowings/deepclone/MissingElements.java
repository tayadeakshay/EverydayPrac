package com.prowings.deepclone;

public class MissingElements {

	public static void main(String[] args) {
int sum=0;
		int[] a = { 1, 2, 3, 4, 6 };
		int expEle = a.length + 1;
		int totalSum = (expEle * (expEle + 1)) / 2;

		for(int a1:a)
			sum+=a1;
		System.out.println("Missing no is "+(totalSum-sum));
	}

}
