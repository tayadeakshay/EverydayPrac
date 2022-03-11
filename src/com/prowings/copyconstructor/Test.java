package com.prowings.copyconstructor;

public class Test {

	public static void main(String[] args) {
		
		Address address = new Address("Pune","Maha",411034);
		
		Student s1 = new Student(10,"Akshay",address);
		
		System.out.println(s1);
		
		Student s2 = new Student(s1);
		
		s1.addrs.state = "Telengana";
		s2.addrs.city = "Akola";
		
		System.out.println("s1 after"+s1);
		System.out.println("s2 after"+s2);
	}
}
