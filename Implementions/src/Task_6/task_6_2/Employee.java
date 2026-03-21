package task_6_2;
import java.util.Scanner;
public class Employee extends Person {
	int id;
	int sal;
	
	void setData(int id, int sal) {
		this.id = id;
        this.sal = sal;
	}
	@Override
	void getData() {
		super.getData();
		System.out.println(id);
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Employee p = new Employee();
		
		System.out.println("name: ");
		String name = s.next();
		
		System.out.println("age: ");
		int age = s.nextInt();
		
		System.out.println("id: ");
		int id = s.nextInt();
		
		System.out.println("sal: ");
		int sal = s.nextInt();
		
		p.setData(name, age);
		p.setData(id, sal);
		
		System.out.println("\nemployee details: ");
		p.getData();
		s.close();
	}
}
