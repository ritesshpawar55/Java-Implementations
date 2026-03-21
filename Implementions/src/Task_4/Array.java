package task_4_1;
import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
	}
}
