package task_5_1;
import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private int age;

    public void setData(int r, String n, int a) {
        rollno = r;
        name = n;
        age = a;
    }

    public void getData() {
        System.out.println(rollno + " " + name + " " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setData(1, "Ritesh", 22);

        int r = sc.nextInt();
        String n = sc.next();
        int a = sc.nextInt();
        s2.setData(r, n, a);

        s1.getData();
        s2.getData();
    }
}