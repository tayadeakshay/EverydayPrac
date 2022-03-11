package com.prowings.anonymous;

//public interface Student {
//
//	void dressCode();
//
//	Student e1 = new Student() {
//		
//		public void dressCode() {
//			
//			System.out.println("Inside Anonymous class of Student");
//		}
//	};
//}

abstract class StudentInfo {

	abstract void printName();

}

public class Student extends StudentInfo {
	public static void main(String[] args) {
		StudentInfo e2 = new StudentInfo() {

			void printName() {
				System.out.println("Inside Anonymous class of StudentInfo");
			}
		};
		e2.printName();
	}

	@Override
	void printName() {
		// TODO Auto-generated method stub
		
	}

}

//class StudentIn extends StudentInfo {
//	void section() {
//		System.out.println("Enter the section of the student");
//	}
//}
