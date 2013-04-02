/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class X {

}

class Y extends X {

}

class Z extends X {

}

public class RunTimeCastDemo {
    // Object Reference Type Casting
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        X xy = new Y(); // compiles ok (up the hierarchy)
        X xz = new X(); // compiles ok (up the hierarchy)

        // Y yz = new Z();  incompatible type (siblings)
        // Y y1 = new X(); X is not a Y
        // Z z1 = new X(); X is not a Z

        X x1 = y; // compiles ok (y is subclass of X)
        X x2 = z; // compiles ok (z is subclass o X)

        Y y1 = (Y) x; // compiles ok but produces runtime error
        Z z1 = (Z) x; // compiles ok but produces runtime error

        Y y2 = (Y) x1; // compiles and runs ok (x1 is type Y)
        Z z2 = (Z) x2; // compiles and runs ok (x2 is type Z)

        // Y y3 = (Y) z inconvertible types (siblings)
        // Z z3 = (Z) y; inconvertible types (siblings)

        Object o = z;
        Object o1 = (Y) o; // compiles ok but produces runtime error

    }

}
