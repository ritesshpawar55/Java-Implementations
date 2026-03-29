package exception_handling;
public class Account {
		private String accountType;
		private long accNo;
		private double balance;
		
		public Account(String accountType, long accNo, double balance) {
	        this.accountType = accountType;
	        this.accNo = accNo;
	        this.balance = balance;
	    }
		
		public void calculateInterest(double rate, double time) throws NegativeBalanceException  {
			if (balance < 0) {
	            throw new NegativeBalanceException();
	        }
	        double si = (balance * rate * time) / 100;
	        System.out.println("Simple Interest: " + si);
		}
		
		public void display() {
			System.out.println("Account details: "+accountType);
			System.out.println("Account number: "+accNo);
			System.out.println("Account Minimum Balance: "+balance);
		}
}
