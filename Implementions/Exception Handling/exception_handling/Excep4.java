package exception_handling;
import java.util.Scanner;
public class Excep4 {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter input: ");
			String s = scan.next();
			
			Integer.parseInt(s);
			
		} catch (NumberFormatException e) {
			System.out.println("Catch successfully "+e);
		} finally {
			System.out.println("The operation is complete.");
		}
		
	}
}
