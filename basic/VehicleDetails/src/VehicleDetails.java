/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */


class Vehicle {

    // Instance fields
    int noOfTires; // no. of tires
    private boolean accessories; //check if accessories or not
    protected String brand; // Brand of the car

    //Static fields
    private static int counter; // no. of Vehicle objects created

    // Constructor
    Vehicle() {
        System.out.println("Constructor of the Super class called");
        noOfTires = 5;
        accessories = true;
        brand= "X";
        counter++;
    }

    // Instance methods
    public void switchOn() {
        accessories = true;
    }
    public void switchOff() {
        accessories = false;
    }
    public boolean isPresent() {
        return accessories;
    }
    private void getBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }

    // Static methods
    public static void getNoOfVehicles() {
        System.out.println("Number of Vehicles: " + counter);
    }
}
class Car extends Vehicle {

    private int carNo = 10;
    public void printCarInfo() {
        System.out.println("Car number: " + carNo);
        System.out.println("No of Tires: " + noOfTires); // Inherited

        // System.out.println("accessories: " + accessorieis); Not inherited
        System.out.println("accessories: " + isPresent());

        // System.out.println("Brand: " getBrand());  // Not inherited
        System.out.println("Brand: " + brand); // Inherited

        // System.out.println("Counter: " + counter); // Not inerited
        getNoOfVehicles();
    }
}

public class VehicleDetails extends Vehicle{
    // Java Inheritance


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Car().printCarInfo();
    }

}
