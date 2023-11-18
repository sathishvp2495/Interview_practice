package com.interview.concepts.oops.inheritance;

class Vehicle {
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make,String model,int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	public void start() {
		System.out.println("Starting the vehicle");
	}
	
	public void stop() {
		System.out.println("Stopping the vehicle");
	}
	
	public void accelerate() {
		System.out.println("Accelerating the vehicle");
	}
	
	public void brake() {
		System.out.println("break the vehicle");
	}
	
}
//derived class (sub class)
class Car extends Vehicle {
	private int numberOfDoors;
	public Car(String make,String model,int year,int numberOfDoors) {
		super(make,model,year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void honkHorn() {
		System.out.println("honking the car horn.");
	}
}

class MotorCycle extends Vehicle {
	public MotorCycle(String make,String model,int year){
		super(make,model,year);
	}
	
	public void Wheelie() {
		System.out.println("performing a wheelie on motorcycle..");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Car car = new Car("Hyundai","i20",2023,4);
		MotorCycle motorCycle = new MotorCycle("Yamaha", "FZ", 2021);
		
		System.out.println("Car Info : ");
		System.out.println("make : "+car.getMake());
		System.out.println("model : "+car.getModel());
		System.out.println("year : "+car.getYear());
		System.out.println("No of Doors : "+car.getNumberOfDoors());
		car.start();
		car.accelerate();
		car.brake();
		car.stop();
		car.honkHorn();
		System.out.println("\n");
		System.out.println("Bike Info : ");
		System.out.println("make : "+motorCycle.getMake());
		System.out.println("model : "+motorCycle.getModel());
		System.out.println("year : "+motorCycle.getYear());
		motorCycle.start();
		motorCycle.accelerate();
		motorCycle.brake();
		motorCycle.stop();
		motorCycle.Wheelie();
		
		
		
	}
}
