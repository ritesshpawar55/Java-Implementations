package exception_handling;
import java.util.Scanner;
public class Excep1 {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		try {
			Scanner s = new Scanner(System.in);
			 x = s.nextInt();
			 y = s.nextInt();
				
			System.out.println("division: "+ x / y);
			
			}
			catch(ArithmeticException e ){
				System.out.println("Catch successfully."+e);
			}
			System.out.println("add: "+ (x + y));
	}
}

