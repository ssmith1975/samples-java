/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class Cube {
    
    int length = 10;
    int breadth = 10;
    int height = 10;
    
    public static int numOfCubes = 0; // static varibale
    public static int getNoOfCubes() { // static method
        return numOfCubes;
    }    
    public Cube() {
        numOfCubes++;
    }

    
}

public class CubeStaticTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number of Cube objects = " + Cube.numOfCubes);
        System.out.println("Number of Cube objects = " + Cube.getNoOfCubes());
    }

}
