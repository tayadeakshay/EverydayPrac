package com.prowings.everyday;

interface StudentInfo {
	void method1();
	public static final int i =10;
}

public abstract class Student implements StudentInfo {
	public abstract void method1();
	int rollNo;
	String name;
	
//	public Student() {
//		
//	}

	public Student(String nam, int rollN) {
		this.rollNo = rollN;
		this.name = nam;
	}

public Student() {
	// TODO Auto-generated constructor stub
}
}

class StudentInfo1 extends Student {

	public void method1() {
		System.out.println("print");
	}

	public StudentInfo1() {super();}
public StudentInfo1(String name,int rollNo)
{super(name,rollNo);
	
}

	

}
