package com.prowings.inheritance;

public class Address {
	int flatNo;
	String location;
	String nearBy;
	String area;
	int pinCode;

	public Address() {
		super();
	}

	public Address(int flatNo, String location, String nearBy, String area, int pinCode) {
		super();
		this.flatNo = flatNo;
		this.location = location;
		this.nearBy = nearBy;
		this.area = area;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "FlatNo=" + flatNo + "\r\n" +"Building name=" + location +"\r\n"+ "Landmark=" + nearBy +"\r\n"+ "Area=" + area
				+"\r\n"+"PinCode=" + pinCode;
	}

}
