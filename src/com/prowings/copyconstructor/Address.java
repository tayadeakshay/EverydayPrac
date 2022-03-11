package com.prowings.copyconstructor;

public class Address {

	String city;
	String state;
	int pin;
	
	
	public Address() {
		super();
	}


	public Address(String city, String state, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public Address(Address ad1) {
		super();
		Address ad2 = new Address();
		ad2.city = ad1.city;
		ad2.state = ad1.state;
		ad2.pin = ad1.pin;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
	
}
