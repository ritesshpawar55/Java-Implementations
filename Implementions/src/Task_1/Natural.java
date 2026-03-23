package Task_1;

class Natural {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int sum = (n * (n + 1)) / 2;

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}