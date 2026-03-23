package Task_1;

class Second{
	public static void main(String[] args) {
		double celcius = Integer.parseInt(args[0]);
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("After converting to Fahrenhiet: "+fahrenheit);
	}
}