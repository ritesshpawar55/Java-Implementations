class Six{
	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double t = Double.parseDouble(args[3]);
		double A = P * Math.pow((1 + r/n), (n*t));
		System.out.println("ans is "+A);
	}
}