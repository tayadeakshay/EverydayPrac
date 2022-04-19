package com.interview.maps;

public class Employee {

int id;
String name;
String city;


public Employee() {
	super();
}


public Employee(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}



}
