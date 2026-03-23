package Task_6.task_6_6;

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

