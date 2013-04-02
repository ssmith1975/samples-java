package com.ssmith1975.Cars;

public class Car implements ICar {
	protected int speed = 15;
	protected int gear = 1;
	protected int drivetrain = 4;
	protected String direction = "N";
	protected String color = "Red";
	protected String fuel =  "Gas";
	
	public void shiftGears(int newGear){
		gear = newGear;
	}
	public void accelerateSpeed(int acceleration){
		speed = speed + acceleration;
	}
	public void applyBrake (int brakingFactor){
		speed = speed - brakingFactor;
	}
	public void turnWheel(String newDirection){
		direction = newDirection;
		
	}
}
