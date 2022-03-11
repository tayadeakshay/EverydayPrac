package com.prowings.everyday;

public class MultipleInh {

	public static void main(String[] args)
	{
		StudentInfo1 s1= new StudentInfo1("Akshay",300);
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		
		StudentInfo1 s2= new StudentInfo1("Akshay",200);
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		
		StudentInfo1 s3=new StudentInfo1();
		
	System.out.println(s2.i);
	s2.method1();
		
	}
}
