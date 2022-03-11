package com.prowings.polymo;

class IsVoid1 {

	public void method1() {
		System.out.println("1");
		return;
	}
}

class IsVoid2 extends IsVoid1 {
	public void method1() {
		System.out.println("2");
	}
}

public class IsVoid {
	public static void main(String[] args) {

		IsVoid1 a1 = new IsVoid1();

		a1.method1();
	}
}