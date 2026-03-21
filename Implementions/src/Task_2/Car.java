//// Example demonstrating Object Oriented Concepts
//
//// CLASS → Blueprint for creating objects
//class Car {
//
//    // ATTRIBUTES → Variables that describe the object
//    String color;
//    int speed;
//    int fuel;
//
//    // BEHAVIOUR → Actions the object can perform (methods)
//    void start() {
//        System.out.println("Car started");
//    }
//
//    void accelerate() {
//        speed += 20;  // speed increases
//        System.out.println("Car accelerated. Current speed: " + speed);
//    }
//
//    void showState() {
//        // STATE OF OBJECT → Current values of attributes
//        System.out.println("Car State:");
//        System.out.println("Color: " + color);
//        System.out.println("Speed: " + speed);
//        System.out.println("Fuel: " + fuel);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        // OBJECT / INSTANCE → Actual entity created from class
//        Car car1 = new Car();   // car1 is an object (instance of Car)
//
//        // Setting ATTRIBUTES
//        car1.color = "Red";
//        car1.speed = 0;
//        car1.fuel = 50;
//
//        // Printing STATE of object
//        car1.showState();
//
//        System.out.println();
//
//        // Calling BEHAVIOUR (methods)
//        car1.start();
//        car1.accelerate();
//
//        System.out.println();
//
//        // STATE changes after behaviour
//        car1.showState();
//
//        System.out.println();
//
//        // Another OBJECT / INSTANCE
//        Car car2 = new Car();
//
//        car2.color = "Blue";
//        car2.speed = 10;
//        car2.fuel = 40;
//
//        // Different STATE for different object
//        car2.showState();
//    }
//}