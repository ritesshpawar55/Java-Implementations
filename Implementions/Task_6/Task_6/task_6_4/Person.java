package Task_6.task_6_4;

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