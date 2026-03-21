package task_5_9;

public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void display() {
        System.out.println(street + ", " + city + ", " + state);
    }
}
