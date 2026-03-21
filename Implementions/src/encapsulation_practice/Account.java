package encapsulation_practice;

class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
		
    		Account a = new Account();
    		a.deposit(100);
    		a.deposit(100);
    		System.out.println("balance: "+a.getBalance());
	  }
}
