package Task_5.task_5_8;

public class Calculator {
	 Double a;
	 Double b;
	 public Calculator(Double a, Double b) {

		this.a = a;
		this.b = b;
	 }
	 public void ArthematicOperations()
	 {
		 System.out.println("Addition is :" +(a+b));
		 System.out.println("Substraction is :"+(a - b)); 
		 System.out.println("Multiplication is :" +(a*b));
		 System.out.println("Division is : " +(a/b));
		 System.out.println("Modulus is :"+(a%b));
	 }
	}