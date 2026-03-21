/*class Lab{
	public static void main(String[] args) {
		for (int i=10; i<=110; i++){
			System.out.println("Numbers from 10 to 110 are "+i);
		}
	}
}
*/

/*class Lab{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++){
			sum += i;
			
		}
		System.out.println(sum);

	}
}
*/

class Lab{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for (int i = 10; i>=1; i--){
			System.out.println(a+ "*" +i+ "="+(a*i));
		}
	}
}