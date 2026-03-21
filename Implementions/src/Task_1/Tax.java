class Tax{
	public static void main(String[] args) {
		
		double income = Double.parseDouble(args[0]);

		if(income>=1000000){
			System.out.println("30% tax");
		}
		else if(income>=500001){ 
			System.out.println("20% tax");
		}
		else if(income>=250001){
			System.out.println("5% tax");
		}
		else if(income<=250000){
			System.out.println("No tax");
		}
		else{
			System.out.println("Enter valid number.");
		}
	}
}