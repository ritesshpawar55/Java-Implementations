package Task_1;

class Five{
	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		double T = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		double A = P*T*R/100;
		System.out.println("Simple Interest of an Investment is "+A);
	}
}  