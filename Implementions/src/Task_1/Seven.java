package Task_1;

class Seven{
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);

		if(num < 0){
			System.out.println("negative");
		}
		else if(num > 0){
			System.out.println("positive");
		}
		else{
			System.out.println("zero");		}
	}
}