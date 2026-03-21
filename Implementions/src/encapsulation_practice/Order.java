package encapsulation_practice;

class Order {
    private String status = "CREATED";

    public void ship() {
        if (status.equals("CREATED")) {
            status = "SHIPPED"; // valid transition
        }
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        Order o = new Order();
        System.out.println("Before: " + o.getStatus());

        o.ship();

        System.out.println("After: " + o.getStatus());
    }
}
