/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
public class Cube {

    int length = 10;
    int breadth = 10;
    int height = 10;

    public int getVolume() {
        return (length*breadth*height);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube cubeObj; // Create a Cube Reference
        cubeObj = new Cube(); // Creates an Object of Cube
        System.out.println("Volume of Cube is : " + cubeObj.getVolume());
    }

}
