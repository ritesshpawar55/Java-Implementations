package Task_5.task_5_9;

public class Person {
    private String name;
    private Address address; 

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.display(); 
    }
}