package com.interview.concepts.oops;

public class Encapsulation {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setBalance(400.0);
		System.out.println("balance is : "+obj.getBalance());
	}

}
