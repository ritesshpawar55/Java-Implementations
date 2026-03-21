package encapsulation_practice;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(300);
        acc.withdraw(800); // invalid

        System.out.println("Balance: " + acc.getBalance());
    }
}