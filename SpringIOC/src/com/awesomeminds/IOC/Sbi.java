package com.awesomeminds.IOC;

public class Sbi implements Bank {

	@Override
	public String getBankName() {
		
		return "SBI";
	}

	@Override
	public int getInterest() {
		// TODO Auto-generated method stub
		return 5;
	}

}
