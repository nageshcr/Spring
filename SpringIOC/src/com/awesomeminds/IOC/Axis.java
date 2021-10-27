package com.awesomeminds.IOC;

public class Axis implements Bank {
	
	public Axis() {
		System.out.println("Constructor is called");
	}

	@Override
	public String getBankName() {

		return "Axis Bank";
	}

	@Override
	public int getInterest() {

		return 10;
	}

}
