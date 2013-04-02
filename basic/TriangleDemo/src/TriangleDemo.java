/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 * This program prints two triangles.
 */
public class TriangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle small = new Triangle(5);
        System.out.println(small.toString());

        Triangle large = new Triangle(15);
        System.out.println(large.toString());
    }

}
