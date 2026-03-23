package Task_5.task_5_5;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(6322,"Savings",50000.00);
		b1.Deposit();
		b1.WithDraw();
		b1.interest();
	}
}