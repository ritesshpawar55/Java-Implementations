package bankacc;
import java.util.Scanner;
public class BankAccount {

		int accno;
		String accType;
		double Balance;
		static double interestRate;
		
		static {
			interestRate = 10.11;
		}
		
		void setter(int accno, String accType, double Balance) {
			this.accno = accno;
			this.accType = accType;
			this.Balance = Balance;
		}
		
		void add() {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Deposit Amount: ");
			int x = s.nextInt();
			Balance = Balance + x;

			System.out.println("Withdraw Amount: ");
			int y = s.nextInt();	
			Balance = Balance - y;
			
			s.close();
		}
		
		
		static double iRate(double balance){
			return (balance * interestRate) / 100;
		}
		void getter() {
			double interest = iRate(Balance);

			System.out.println(+accno+" "+accType+" "+Balance+" "+interestRate+" ");
			System.out.println("interest earned: "+interest);
		}
		
}