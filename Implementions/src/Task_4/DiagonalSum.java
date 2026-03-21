package task_4_1;
import java.util.*;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }

        System.out.println(sum);
    }
}
