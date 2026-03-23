package Task_5.task_5_2;
class Person {
    String name;
    int age;
    String country;

    void setData(String n, int a, String c) {
        name = n;
        age = a;
        country = c;
    }

    void getData() {
        System.out.println(name + " " + age + " " + country);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setData("Ravi", 25, "India");
        p.getData();
    }
}
