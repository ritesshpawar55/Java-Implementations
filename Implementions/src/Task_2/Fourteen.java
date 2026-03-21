import java.util.Scanner;
class Fourteen {
    public static void main(String[] args) {

        Scanner rr = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = rr.nextInt();

        System.out.print("Enter second number: ");
        int num2 = rr.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = rr.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero not allowed");
                break;
            default:
                System.out.println("Invalid operator");
        }
        rr.close();
    }
}