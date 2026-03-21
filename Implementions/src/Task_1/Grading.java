class Grading{
	public static void main(String[] args) {
		
		double marks = Double.parseDouble(args[0]);

		if(marks>=90){
			System.out.println("A Grade");
		}
		else if(marks>=80){
			System.out.println("B Grade");
		}
		else if(marks>=70){
			System.out.println("C Grade");
		}
		else if(marks>=60){
			System.out.println("D Grade");
		}
		else if(marks>=50){
			System.out.println("F Grade");
		}
		else if(marks<49){
			System.out.println("Fail");
		}
		else{
			System.out.println("Enter valid percentage number.");
		}
	}
}