package com.prowings.getset;

public class Test {
public static void main(String[] args) {
	
	GetSet e1 = new GetSet();
	
	e1.setId(4589);
	e1.setName("Akshay");
	
	System.out.println("ID = "+e1.retId()+"\n"+"Name :- "+e1.getName());
}
}
