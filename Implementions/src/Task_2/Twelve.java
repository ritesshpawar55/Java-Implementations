class Twelve{
	public static void main(String[] args) {
		double bill_amount = 35.10;
		double tip = 15;
		double tipp_amount;
		tipp_amount = bill_amount * (tip / 100);
		System.out.println("Bill Amount: " + bill_amount);
		System.out.println("Tip: " + tip);
		System.out.println(tipp_amount);
	}
}