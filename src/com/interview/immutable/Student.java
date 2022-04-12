package com.interview.immutable;

public final class Student {

private final int id;
private final String name;
private final Address add2;

public Student(int id, String name, Address add) {
	super();
	this.id = id;
	this.name = name;
	
	Address addDummy = new Address();
	addDummy.setCity(add.getCity());
	addDummy.setState(add.getState());
	addDummy.setPin(add.getPin());
	
	this.add2 = addDummy;
}

public Student(Student std) {
	super();
	this.id = std.id;
	this.name = std.name;
	
	Address addDummy = new Address();
	addDummy.setCity(std.add2.getCity());
	addDummy.setState(std.add2.getState());
	addDummy.setPin(std.add2.getPin());
	
	this.add2 = addDummy;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public Address getAdd() {
	Address dummy = new Address();
	dummy.setCity(add2.getCity());
	dummy.setState(add2.getState());
	dummy.setPin(add2.getPin());
	
	//return this.add2;
	return dummy;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", add=" + add2 + "]";
}





}
