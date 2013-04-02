/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

abstract class Shape {
    public String color;

    public Shape() {

    }
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }
    abstract public double area(); // abstract method (required for subclasses)
}

class Point extends Shape {
    static int x, y;
    public Point() {
        x = 0;
        y = 0;
    }
    public double area() {
        return 0;
    }
    public double perimeter() {
        return 0;
    }
    public static void print() {
        System.out.println("point: " + x + ","+ y);
    }
}

public class AbstractClassDemo {
//Abstract Class in java
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p = new Point();
        p.print();
    }

}
