package task_4_1;

import java.util.*;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[c][r];
        int[][] res = new int[r][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < c; i++)
            for (int j = 0; j < r; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
