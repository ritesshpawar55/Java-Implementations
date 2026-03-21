class Nine{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int x = Integer.parseInt(args[3]);
		int y = Integer.parseInt(args[4]);
		int z = Integer.parseInt(args[5]);	

		if (a > b && a > c){
			System.out.println("1st one is great");
		}
		else if(b > c){
			System.out.println("2nd is great");
		}
		else{
			System.out.println("3rd is great");
		}

		System.out.println((x>y && x>z) ?x: (y>z ? y:z));
	}
}	