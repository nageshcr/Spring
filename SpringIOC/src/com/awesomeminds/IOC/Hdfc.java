package com.awesomeminds.IOC;

public class Hdfc implements Bank {

	@Override
	public String getBankName() {

		return "HDFC Bank";
	}

	@Override
	public int getInterest() {
		
		return 8;
	}

}
