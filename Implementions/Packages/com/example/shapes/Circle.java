package com.example.shapes;
import com.example.utils.MathUtils;

public class Circle {
    
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
	        MathUtils m = new MathUtils();      
	        double pi = m.getPI();
	        
	        return pi * radius * radius;
	}
	public void calArea(double r) {
		double area = Math.PI * r * r;
		System.out.println("area of circle: "+area);
	}
	
	public double getRadius() {
        return radius;
    }
}
