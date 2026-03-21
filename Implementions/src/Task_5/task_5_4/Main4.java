package task_5_4;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name + " " + this.age);
    }

    void compare(Person p) {
        if(this.age > p.age) System.out.println(this.name + " is older");
        else if(this.age < p.age) System.out.println(p.name + " is older");
        else System.out.println("Same age");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person("Aman", 22);

        p1.display();
        p2.display();

        p1.compare(p2);
    }
}