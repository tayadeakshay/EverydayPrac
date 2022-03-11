package com.prowings.overload;
import java.util.Scanner;

public class OverLoad {
	void method1(int i, int j) {
		System.out.println("1");
	}

	void method1(int i, long j) {
		System.out.println("2");
	}

	void method1(Integer i, Integer j) {
		System.out.println("3");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OverLoad a1 = new OverLoad();
		int i = 10;
		long j = 20;
		a1.method1(i, j);
		sc.hasNext();
	}
}
