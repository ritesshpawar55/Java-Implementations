package Task_6.task_6_pro7;

public class CreditCardPayment implements Payment{
	
	public void pay(double amount) {
		System.out.println("Processing CreditCardPayment: "+amount);
	}
}