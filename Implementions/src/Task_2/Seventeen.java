class Seventeen{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		//SWITCH statement.
		switch(a){
			case 1,2,3,4 -> System.out.println("summer");
			case 5,6,7,8 -> System.out.println("rainy");
			case 9, 10,11,12 -> System.out.println("winter");
			default -> System.out.println("enter valid number");
		}

	}
}