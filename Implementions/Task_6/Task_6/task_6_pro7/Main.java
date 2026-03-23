package Task_6.task_6_pro7;

public class Main {

	public static void main(String[] args) {
		
		PaymenProcessor p = new PaymenProcessor();
		
		p.process(new CreditCardPayment(), 1000);
		p.process(new PayPalPayment(), 100);
	}

}