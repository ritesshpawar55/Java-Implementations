package task_3;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean flag = true;

        for(char c = 'a'; c <= 'z'; c++) {
            if(s.indexOf(c) == -1) {
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("Pangram");
        else System.out.println("Not Pangram");
    }
}