package com.prowings.anonymous;

abstract class StudentI {
	abstract void printName();
}

public class A{
	public static void main(String[] args) {
		StudentI e2 = new StudentI() {

			void printName() {
				System.out.println("Inside Anonymous class of StudentInfo");
			}
		};
		e2.printName();
	}
	
}
