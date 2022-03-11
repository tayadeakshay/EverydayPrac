package com.prowings.inheritance;

public class Test {

	public static void main(String[] args) {
		
		Address address = new Address(207,"Gurunanak Plaza","Near Shelar Yamaha","Kasarwadi Pune",411034);
		
		Student s1 = new Student("Ajay",31366,address);
		System.out.println(s1);

	}

}
