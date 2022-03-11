package com.prowings.objarray;

public class Student extends Teacher{

int id;
String name;

public Student() {
	super();
}
public Student(int id,String name)
{
this.id=id;
this.name=name;
}

protected Student run()
{
	Student s=new Student();
System.out.println("I am running");	
return s;
}

public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
}
