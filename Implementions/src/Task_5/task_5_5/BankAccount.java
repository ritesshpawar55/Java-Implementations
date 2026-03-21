package task_5_5;

public class BankAccount {
	int accountNumber;
	String accountType;
	Double balance;
	static int interestRate;
	static
	{
	     interestRate = 5;
	}
	public BankAccount(int accountNumber, String accountType, Double balance) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void Deposit()
	{
		int Deposit=10000;
		balance=Deposit+balance;
		System.out.println("Balance is: "+balance);
	}
	public void WithDraw()
	{
		int WithDraw=1000;
		balance=balance-WithDraw;
		System.out.println("Afterwith Balance is: " +balance);
	}
	public void interest()
	{
		double interest=(balance*interestRate)/100;
		balance=balance+interest;
		System.out.println("Balance after interest:"+balance);
		}
}
