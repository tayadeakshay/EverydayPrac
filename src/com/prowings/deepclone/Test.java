package com.prowings.deepclone;

public class Test implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Pune","India",411034);
		
		Student s1 = new Student(10,"Akshay",address);
		
		System.out.println(s1);
		
		Student s2=(Student)s1.clone();
		System.out.println(s2);
		
		s1.addr.city = "Akola";
		System.out.println(s1);
		System.out.println(s2);
System.out.println(s1.hashCode()+"s1 address hashcode "+ s1.addr.hashCode());
System.out.println(s2.hashCode()+"s2 address hashcode "+s2.addr.hashCode());
	}

}
