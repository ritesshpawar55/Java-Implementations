package com.company;
import com.company.account.Account;
import com.company.hr.Employee;

public class CompanyTest {

	public static void main(String[] args) {
		
		Account a = new Account("SBI", 111555, "Ritessh Pawar");
		a.displayAccountDetails();
		
		System.out.println();
		
		Employee e = new Employee("Kashish",12311,500000);
		e.displayEmployeeDetails();
	}
}
