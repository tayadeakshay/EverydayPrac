package com.prowings.inheritance;

public class Student {

	String name;
	int id;
	Address address;

	public Student() {
		super();
	}

	public Student(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student name=" + name +"\r\n"+"\r\n"+ "Id=" + id +"\r\n"+"\r\n"+ "Address:"+"\r\n" + address;
	}
	
	

}
