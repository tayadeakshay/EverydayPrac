package com.prowings.over;

public class Test {

	public static void main(String[] args) {
		OverRide o1 = new Child();
		Child c1 = new Child();
		c1.run();
		o1.run();
	}

}
