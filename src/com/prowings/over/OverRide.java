package com.prowings.over;


public class OverRide {

	protected void run() 
	{
		System.out.println("I am Parent");
	}
}

class Child extends OverRide {
	public void run() {
		System.out.println("I am Child");
	}
}
