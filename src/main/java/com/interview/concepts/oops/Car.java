/**
 * 
 */
package com.interview.concepts.oops;

/**
 * @author sathi
 *	Example for Classn & Object 
 */
public class Car {
	String make;
	String model;
	
	void start() {
		System.out.println("Starting the car.."+make+" - "+model);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();	
		myCar.make="Toyota";
		myCar.model="Corolla";
		myCar.start();
	}
}
