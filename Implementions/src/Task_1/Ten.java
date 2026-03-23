package Task_1;

class Ten{
	public static void main(String[] args) {
		
		/* byte, short, int, long, float
		double, char, boolean*/
		//Type Casting and Converion implicit/explicit.
		
		byte b = 127;
		short a =(short) b;
		
		int x  = 4149894;
		long y =(long) x;

		float r = 4.42f;
		double s = (double) r; 

		byte p = 10;
		byte q = 30;
		int result = p*q;


		System.out.println(b);
		System.out.println(y);
		System.out.println(result);
	}
}