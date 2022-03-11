package com.prowings.objarray;

public class Teacher {

int empID;
String subject;

public Teacher() {
	super();
}
public Teacher(int empID, String subject) {
	super();
	this.empID = empID;
	this.subject = subject;
}
@Override
public String toString() {
	return "Teacher [empID=" + empID + ", subject=" + subject + "]";
}

protected Object run()
{
System.out.println("Teacher is running");
return 1;
}

}
