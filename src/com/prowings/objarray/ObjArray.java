package com.prowings.objarray;

public class ObjArray {

	public static void main(String[] args) {

		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Sham");
		Student s3 = new Student(30, "ABC");

		Teacher t1 = new Teacher(110, "Physics");
		Teacher t2 = new Teacher(120, "Chemistry");
		Teacher t3 = new Teacher(130, "Maths");

		Object[] school = { s1, s2, s3, t1, t2, t3, 11, 12 };

		for (Object o : school) {
			if (o instanceof Student) {
				System.out.println(o);
			}

			if (o instanceof Integer) {
				System.out.println(o);
			}

		}
		t1.run();

	}
}
