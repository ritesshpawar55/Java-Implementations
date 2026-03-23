package com.company.hr;

public class Employee {
	
	private String name;
	private int eid;
	private double esal;
	
	public Employee (String name, int eid, double esal) {
		this.name=name;
		this.eid=eid;
		this.esal=esal;
	}
	
	public void displayEmployeeDetails() {
		System.out.println(name);
		System.out.println(eid);
		System.out.println(esal);
	}
}
