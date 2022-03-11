package com.prowings.copyconstructor;

public class Student {

	int rollNo;
	String name;
	Address addrs;
	
	
	public Student() {
		super();
	}


	public Student(int rollNo, String name, Address add) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.addrs = add;
	}
	
	public Student(Student std) {
		super();
		this.rollNo = std.rollNo;
		this.name = std.name;
		
//		Address add1 = new Address();
//		add1.city = std.addrs.city;
//		add1.state = std.addrs.state;
//		add1.pin = std.addrs.pin;
		Address add1 = std.addrs;

	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addrs=" + addrs + "]";
	}
	
	
	
	
}
