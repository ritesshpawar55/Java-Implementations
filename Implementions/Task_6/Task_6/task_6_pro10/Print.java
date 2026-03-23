package Task_6.task_6_pro10;

public class Print extends Printer {
	
	void createPrinter() {
		Printer p = new Printer() {
			
			@Override
			void printMessage() {
		
				System.out.println("Its Printed now.");
			}
		};
		p.printMessage();
	}
	
	public static void main(String[] args) {
		Print p1 = new Print();
		p1.createPrinter();
	}
}