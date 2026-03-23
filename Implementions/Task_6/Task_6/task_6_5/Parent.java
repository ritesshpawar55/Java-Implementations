//assignment 6-5

package Task_6.task_6_5;

class Parent {
	
	void disp() {
		System.out.println("This is a parent class.");
	}
}
	
class Child extends Parent{
	
	void display() {
		System.out.println("This is a child class.");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.disp();
		Child c = new Child();
		c.display();
		c.disp();
	}	
}
