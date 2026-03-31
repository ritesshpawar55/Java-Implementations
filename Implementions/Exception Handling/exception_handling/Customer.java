package exception_handling;
public class Customer {
		String name;
		String address; 
		int id; 
		long phoneno;
		Account acc;
	
		public Customer (String name, String address, int id, long phoneno, Account acc) {
			 this.name=name;
			 this.address=address;
			 this.id=id;
			 this.phoneno=phoneno;
			 this.acc=acc;
		}
		public void disp() {
			System.out.println("Customer Name: "+name);
			System.out.println("Customer address: "+address);
			System.out.println("Customer id: "+id);
			System.out.println("Customer phoneno: "+phoneno);
			acc.display();
		}		
		public static void main(String[] args) {
			Account acc = new Account("Savings", 123456789, 5000);
			Customer customer = new Customer("Yogita Pawar", "Nashik", 111, 726286798, acc);
			customer.disp();

	        try {
	            acc.calculateInterest(5, 2);
	        } catch (NegativeBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}

