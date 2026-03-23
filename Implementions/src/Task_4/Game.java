package Task_4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int secret = new Random().nextInt(101);
        Scanner sc = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Guess (0-100): ");
            guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Congrats!!! You made it.");
                break;
            } else if (guess < secret) {
                System.out.println("Too low");
            } 
            else if(guess > 101) {
            		System.out.println("Enter between 0-100 only.");
            }
            else {
                System.out.println("Too high");
            }
        }
        sc.close();
    }
}