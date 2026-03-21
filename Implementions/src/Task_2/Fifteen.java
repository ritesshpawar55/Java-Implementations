class Fifteen{
	public static void main(String[] args) {
		
		char a = args[0].charAt(0);

		switch(a){
			case 'R' -> System.out.println("stop");	
				
			case 'Y' -> System.out.println("wait");
							
			case 'G' -> System.out.println("go");

			default -> System.out.println("not matched. enter any of this only: R, Y, G");
		}
	}
}