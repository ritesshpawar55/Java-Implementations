package com.example.test;

import com.example.shapes.Circle;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(7.0);

		System.out.println(c.getRadius());
		System.out.println(c.calculateArea());
	}
}
