//Create a class named 'Member' having the following members:
//Data members: 1 – Name, 2 – Age, 3 - Phone number, 4 – Address, 5 - Salary It also has a
//method named 'printSalary' which prints the salary of the members. Two classes 'Employee'
//and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data
//members'specialization' and 'department' respectively. Now, assign name, age, phone number,
//address and salary to an employee and a manager by making an object of both of these
//classes and print the same.

package assignment_six_six;

 public class Member {
	
	String name;
	int age;
	long pnumber;
	String address;
	int sal;
	
	void printSalary() {
		System.out.println("The salary of the members: "+sal);
	}
}
	
class Employee extends Member{

	String spec;
	
	public Employee(String n, int a, long p, String addr, int sal, String spec) {
		 	this.name = n;       
	        this.age = a;
	        this.pnumber = p;
	        this.address = addr;
	        this.sal = sal;
	        this.spec = spec;
	}
	void printDetails() {
        System.out.println("Employee - Name: " + name + ", Age: " + age + 
                          ", Phone: " + pnumber + ", Address: " + address);
        printSalary();
        System.out.println("Specialization: " + spec + "\n");
    }
}

class Manager extends Employee{
	
	String dep = "Primeee";
	public Manager(String n, int a, long p, String addr, int sal, String dept) {
		super(dept, sal, p, dept, sal, dept);
		this.name = n;
        this.age = a;
        this.pnumber = p;
        this.address = addr;
        this.sal = sal;
        this.dep = dept;	
	}
	void printDetails() {
        System.out.println("Manager - Name: " + name + ", Age: " + age + 
                          ", Phone: " + pnumber + ", Address: " + address);
        printSalary();
        System.out.println("Department: " + dep + "\n");
    }
}
	
class Main {
	    public static void main(String[] args) {
	        
	        Employee e = new Employee("Ritesh", 22, 9130563L, "Nashik", 900001, "Software Dev");
	        e.printDetails();
	        
	        Manager m = new Manager("John", 35, 9876543L, "Mumbai", 120000, "IT");
	        m.printDetails();
	    }
}

