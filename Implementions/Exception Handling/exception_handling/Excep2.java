package exception_handling;
class Excep2{
	public static void main(String[] args) {
		
		try {
		int[] arr;
		arr = new int[2];
		arr[0] = 10;
		arr[1] = 100;
		System.out.println("Accessible value: \n" + arr[0]+ "\n"+arr[1]);
		arr[2] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catched Successfully." +e);
		}
	}  
}  