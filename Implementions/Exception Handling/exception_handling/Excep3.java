package exception_handling;
public class Excep3 {
	
	public static void main(String[] args) {
		
		String string = null;
		
		try {
			string.charAt(1);

		} catch (NullPointerException e) {	
			System.out.println("Catch successfully "+e);
			
		} finally {
			System.out.println("The operation is complete.");
		}
	}
}