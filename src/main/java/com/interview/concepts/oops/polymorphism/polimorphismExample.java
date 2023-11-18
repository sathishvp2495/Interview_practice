package com.interview.concepts.oops.polymorphism;

public class polimorphismExample {
	
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car("Ford");
		vehicles[1] = new Bicycle("Mountain Bike");
		vehicles[2] = new Car("Toyota");
		
		for(Vehicle vehicle : vehicles) {
			vehicle.start();
			vehicle.start();
			vehicle.accelerate();
			vehicle.brake();
			
			if(vehicle instanceof Car) {
				((Car) vehicle).honkHorn();
			}
			
			if(vehicle instanceof Bicycle) {
				((Bicycle) vehicle).ringBell();
			}
			System.out.println();
		}
	}
	

}

class Vehicle {
	private String name;
	Vehicle(String name){
		this.name = name;
	}
	public void start() {
		System.out.println("starting the vehicle.");
	}
	public void stop() {
		System.out.println("Stopping the vehicle");
	}
	public void accelerate() {
		System.out.println("acclerating the vechicle");
	}
	public void brake() {
		System.out.println("break the vehicle");
	}
}

class Car extends Vehicle {
	Car(String name){
		super(name);
	}
	
	public void honkHorn() {
		System.out.println("Honking the car horn..");
	}
	
}

class Bicycle extends Vehicle {
	Bicycle(String name) {
		super(name);
	}
	
	public void ringBell() {
		System.out.println("ring the bicycle bell..");
	}
}
