/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class Cube {
    int length;
    int breadth;
    int height;
    public int getVolume() {
        return (length * breadth * height);
    }

    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
    }
}
public class SpecialCube1 extends Cube {
    // An example of a class demonstrating constructor chaining using explicit super() call.
    int weight;
    
    SpecialCube1() {
        super(10, 20, 30); // Will Give a Compilation Error without this line
        weight = 10;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpecialCube1 specialObj1 = new SpecialCube1();
        System.out.println("Volume of SpecialCube1 is : " + specialObj1.getVolume());
    }

}
