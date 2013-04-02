/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Surfaces;

/**
 *
 * @author Kush
 */
public class Square {
    protected double sd;

    public Square() {
        sd = 0.0;
    }

    public Square(double side) {
        sd = (side<=0) ? 0.00 : side;
    }

    public double getSide() {
        return sd;
    }

    public void setSide(double side) {
        sd = (side <=0) ? 0.00 : side;
    }

    public double calculatePerimeter() {
        return sd * 4;
    }

    public double calculateArea() {
        return sd * sd;
    }

}
