class Eight{
	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		
		if(i%400 == 0){
			System.out.println("leap year");
		}
		else if(i%100==0){
			System.out.   println("not leap year");
		}
		else if(i%4==0){
			System.out.println("leap year");
		}
		else{
			System.out.println("not leap year");
		}
	}
}