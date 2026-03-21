//assignment 6-problem 1
package assignment_six_pro1;

public abstract class Shape {
    
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle area: " + circle.area());      
        System.out.println("Rectangle area: " + rectangle.area()); 

        Shape[] shapes = {new Circle(3.0), new Rectangle(2.0, 5.0)};
        for (Shape s : shapes) {
            System.out.println("Shape area: " + s.area());
        }
    }
}


