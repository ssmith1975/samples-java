/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

interface Shape {
    public double area();
    public double volume();
}

class Point implements Shape {
    static int x, y;
    public Point() {
        x = 0;
        y = 0;
    }

    public double area() {
        return 0;
    }
    public double volume() {
        return 0;
    }
    public static void print() {
        System.out.println("point: " + x + "," + y);
    }
}


public class InterfaceDemo {
// Java Interface
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p = new Point();
        p.print();
    }

}
