package Task_1;

import java.util.Scanner;
class Game{
	public static void main(String[] args) {
		Scanner rr = new Scanner(System.in);
		int n = (int) (Math.random()*10);

		while(true){
			System.out.println("Guess the number between 0-9: ");
			int raw = rr.nextInt();
		if(n==raw){
			System.out.println("Congrats You Win.");
			break;
		}
		else if (raw>10){
			System.out.println("you've entered big no please enter valid no only.");
			break;
		}
		else if (raw<0){
			System.out.println("you've entered negative no please enter valid no only.");
			break;
		}
		else if(raw>n){
			System.out.println("too high");
		}
		else if(raw<n){
			System.out.println("too low");
		}
		}
	}
}