package Task_1;

class Four{
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Math.sqrt(a * a + b * b);
		System.out.println("Hypotenuse of right angled triangle is "+c);
	}
}