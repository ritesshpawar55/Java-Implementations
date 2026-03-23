package com.company.account;

public class Account {
	
	private String bank;
	private int accno;
	private String name;
	
	public Account(String bank, int accno, String name) {
		this.bank=bank;
		this.accno=accno;
		this.name=name;
	}
	
	public void displayAccountDetails() {
		System.out.println(bank);
		System.out.println(accno);
		System.out.println(name);
	}
}
