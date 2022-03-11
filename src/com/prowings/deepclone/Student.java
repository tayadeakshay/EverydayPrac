package com.prowings.deepclone;

public class Student implements Cloneable{

	int rollNo;
	String name;
	Address addr;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, Address addr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.addr = addr;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		Student std =(Student)super.clone();
		std.addr = (Address)addr.clone();
		return std;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addr=" + addr + "]";
	}

	
	
	
	
}
