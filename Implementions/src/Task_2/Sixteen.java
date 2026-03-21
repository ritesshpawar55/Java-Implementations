class Sixteen{
	public static void main(String[] args) {
		
		char a = args[0].charAt(0);
		//1	
		String result = (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') 
						? "yes it's a vowel" : "not a vowel sorrryy";

		System.out.println(result);
		//2
		switch(a){
		case 'a':
			System.out.println("2 vowel.");
			break;
		case 'e':
			System.out.println("yes it's a vowel.");
			break;
		case 'i':
			System.out.println("yes it's a vowel.");
			break;
		case 'o':
			System.out.println("yes it's a vowel.");
			break;
		case 'u':
			System.out.println("yes it's a vowel.");
			break;	
		default:
			System.out.println("Not a vowel, sorrry");
		
		//3
		switch(a){
			case 'a', 'e', 'i', 'o', 'u':
				System.out.println("3 vowel");
			 	break;
			default:
				System.out.println("not a vowel");
		}
	}
	}
}