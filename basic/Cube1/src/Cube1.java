/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
public class Cube1 {

    int length;
    int breadth;
    int height;

    public int getVolume() {
        return (length*breadth*height);
    }

    Cube1() {
        length = 10;
        breadth = 10;
        height = 10;
    }

    Cube1(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube1 cubeObj1, cubeObj2;
        cubeObj1 = new Cube1();
        cubeObj2 = new Cube1(10,  20, 30);

        System.out.println("Volume of cubeObj1 is : " + cubeObj1.getVolume());
        System.out.println("Volume of cubeObj2 is : " + cubeObj2.getVolume());
    }
}