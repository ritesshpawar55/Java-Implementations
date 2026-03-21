class Electric{
	public static void main(String[] args) {
		
		double unit = Double.parseDouble(args[0]);

		if(unit>=300){
			System.out.println("Rs. 8 per unit");
		}
		else if(unit>=201){ 
			System.out.println("Rs. 7 per unit");
		}
		else if(unit>=101){
			System.out.println("Rs. 6 per unit");
		}
		else if(unit<=100){
			System.out.println("Rs. 5 per unit");
		}
		else{
			System.out.println("Enter valid number.");
		}
	}
}