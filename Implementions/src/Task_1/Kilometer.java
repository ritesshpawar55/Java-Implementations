package Task_1;

class Kilometer{
	public static void main(String[] args) {
		double a  = Integer.parseInt(args[0]);

		double miles = a * 0.621371;

		System.out.println("After conversion: "+miles);
	}
}