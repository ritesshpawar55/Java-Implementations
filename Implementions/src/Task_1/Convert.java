package Task_1;
class Convert{
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		switch(n){
			case 0 -> System.out.println("ZERO");
			case 1 -> System.out.println("ONE");
			case 2 -> System.out.println("TWO");
			case 3 -> System.out.println("THREE");
			case 4 -> System.out.println("FOUR");
			case 5 -> System.out.println("FIVE");
			default -> System.out.println("Enter between 0-5 only.");
			
		}
	}
}