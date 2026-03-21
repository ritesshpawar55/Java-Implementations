package task_4_1;
import java.util.*;
public class TwoMatrices{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
