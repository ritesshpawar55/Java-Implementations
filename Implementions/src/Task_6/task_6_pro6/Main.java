package bankacc;
public class Main {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setter(11111,"private",5000);
		b.add();
		b.getter();
	}
}
