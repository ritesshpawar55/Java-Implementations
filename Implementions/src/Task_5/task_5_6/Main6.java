package task_5_6;

class BankAccount {
    int accno;
    String accType;
    double balance;
    static double interestRate;

    static {
        interestRate = 5.0;
    }

    BankAccount(int a, String t, double b) {
        accno = a;
        accType = t;
        balance = b;
    }

    static double calculateInterest(double bal) {
        return (bal * interestRate) / 100;
    }

    void display() {
        double interest = calculateInterest(balance);
        System.out.println(accno + " " + accType + " " + balance + " " + interest);
    }
}

public class Main6 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Saving", 10000);
        BankAccount b2 = new BankAccount(102, "Current", 20000);

        b1.display();
        b2.display();
    }
}
