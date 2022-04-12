package com.interview.immutable;

public class Test {

	public static void main(String[] args) {

		Address ad1 = new Address("Pune","Maha",411034);
		Student s1 = new Student(10,"Ram",ad1);
		
		System.out.println("s1 : "+s1);
		
		s1.getAdd().setCity("Mumbai");
		
		Student s2 = new Student(s1);
		
		s2.getAdd().setCity("Mumbai");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println(s1==s2);
	}

}
