package task_4_1;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int a = s.nextInt();
		int[] arr = new int[a];
		
		System.out.println("enter elements: ");
		for(int i=1;i<a;i++) {
			arr[i] = s.nextInt();
		}		
		int min = arr[1];
        int max = arr[0];
        for (int i = 1; i < a; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
	}
}
