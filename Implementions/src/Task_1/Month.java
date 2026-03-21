class Month{
	public static void main(String[] args) {

		int month = Integer.parseInt(args[0]);

		switch(month){
			case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 days.");

			case 4,6,9,11 -> System.out.println(" this month has 30 days.");

			case 2 -> System.out.println(" this month has only 28 days.");

			default -> System.out.println("Enter valid number bet 1-12 only.");
		}
	}
}