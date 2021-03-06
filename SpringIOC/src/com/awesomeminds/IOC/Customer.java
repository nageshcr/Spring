package com.awesomeminds.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("configuration loaded");
		Bank bank = context.getBean("bank", Bank.class);

		System.out.println(bank.getBankName());
		System.out.println(bank.getInterest());

	}

}
