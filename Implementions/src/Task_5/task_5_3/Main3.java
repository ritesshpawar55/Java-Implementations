package task_5_3;

class Person {
    String name;
    int age;
    String country;

    Person() {
        name = "Unknown";
        age = 0;
        country = "NA";
    }

    Person(String n, int a, String c) {
        name = n;
        age = a;
        country = c;
    }

    void display() {
        System.out.println(name + " " + age + " " + country);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ritesh", 22, "India");

        p1.display();
        p2.display();
    }
}
