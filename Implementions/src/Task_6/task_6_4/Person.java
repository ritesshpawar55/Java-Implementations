//4. Demonstrate calling the constructor of the base class from the constructor of the derived
//class. Create objects of person and employee classes to show the order of invocation of
//constructors.
package assignment_six_four;

public class Person {
	
	String a;
	Person(){
		 a = "Adidas";
		 System.out.println("person constructor: "+a);
	}
}

class Employee extends Person{
	String b;
	Employee(){
		super();
		b = "Duramo";
		System.out.println("employee contructor: "+b);
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
	}
}