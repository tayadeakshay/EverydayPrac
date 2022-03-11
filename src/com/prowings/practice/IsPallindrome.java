package com.prowings.practice;

public class IsPallindrome {

	public static String pallindrome(int a) {
		int temp =a,res=0,rem;
		
		while(a!=0)
		{
			rem=a%10;
			res=res*10 + rem;
			a=a/10;
		}	
		System.out.println(res);
		String result =(temp==res)?"The number is Pallindrome":"Not a Pallindrome";
		
		return result;
	}
	
	
}
