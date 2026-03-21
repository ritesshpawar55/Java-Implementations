package task_3;

public class FactorialSeries {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            int fact = 1;
            for(int j = 1; j <= i; j++) fact *= j;
            System.out.println(i + " = " + fact);
        }
    }
}
