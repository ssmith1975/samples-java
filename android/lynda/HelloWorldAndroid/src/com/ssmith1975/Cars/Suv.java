package com.ssmith1975.Cars;

public class Suv extends Car {

	public void applyBrake(int brakingFactor){
		
		super.applyBrake(brakingFactor);
		speed = speed - brakingFactor;
	}

}
