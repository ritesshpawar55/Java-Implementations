package task_4_1;

import java.util.*;

public class FirstSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        		arr[i] = sc.nextInt();

        int mid = n / 2;
        int sum1 = 0, sum2 = 0;
        
        for (int i = 0; i < mid; i++) 
        		sum1 += arr[i];
        for (int i = mid; i < n; i++) 
        		sum2 += arr[i];
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
