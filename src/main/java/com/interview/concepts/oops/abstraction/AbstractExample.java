package com.interview.concepts.oops.abstraction;

abstract class Shape {
	
	public abstract double calculateArea();
		
	abstract double calculatePerimeter();
	
	 double calculateSalary() {
		 return 0;
	 }

}

class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length * width;		
	}
	
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
}

class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
}

public class AbstractExample {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(15, 10);
		Circle circle = new Circle(5);
		
		System.out.println("Rectangle Info:");
		System.out.println("Area : "+rectangle.calculateArea());
		System.out.println("perimeter : "+rectangle.calculatePerimeter());
		
		System.out.println("\n");
		System.out.println("Circle Info:");
		System.out.println("Area : "+circle.calculateArea());
		System.out.println("perimeter : "+circle.calculatePerimeter());
		
		
	}
}
