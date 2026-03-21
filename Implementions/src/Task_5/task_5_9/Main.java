package task_5_9;

public class Main {
    public static void main(String[] args) {

        Address addr = new Address("MG Road", "Trivandrum", "Kerala");
        Person person = new Person("Ritessh", addr);

        person.display();

        System.out.println();


        Student student = new Student();
        student.setName("Anu");
        student.setAge(20);
        student.setGpa(8.5);

        student.display();
    }
}