package exception_handling;
public class Excep5 {
	public static void main(String[] args) {
		
		try {
			try {
				int a = 100;
				int b = 0;
				System.out.println("Dividing two integers: "+ (a/b));
				
			} catch (ArithmeticException e) {
				System.out.println("Catched first inner try block "+e);
			}

			try {
				int[] arr = {10, 20, 30};
				System.out.println(arr[3]);
			
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Catched second inner try block "+e);
			}
			
		} catch (Exception e) {
			System.out.println("Catched all exceptions successfully "+e);
		} finally {
			System.out.println("The operation is complete.");
		}
	}
}
