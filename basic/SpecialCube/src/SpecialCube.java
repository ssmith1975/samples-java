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
    
    Cube() {
        this(10,10);
        System.out.println("Finished with Deault Constructor of Cube");
    }
    Cube(int l, int b) {
        this(l, b, 10);
        System.out.println("Finished with Parameterized Constructor having 2 params of Cube");
    }
    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
    }
}

public class SpecialCube extends Cube {
    // Constructor Chaining
    
   int weight;

   SpecialCube() {
        super();
        weight = 10;
    }
   SpecialCube(int l, int b) {
       this(l, b, 10);
       System.out.println("Finished with Parameterized Constructor having 2 params of SpecialCube");
   }

   SpecialCube(int l, int b, int h) {
       super(l, b, h);
       weight = 20;
       System.out.println("Finished with Parameterized Constructor having 3 params of SpecialCube");
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpecialCube specialObj1 = new SpecialCube();
        SpecialCube specialObj2 = new SpecialCube(10,20);

        System.out.println("Volume of SpecialCube1 is : " + specialObj1.getVolume());
        System.out.println("Weight of SpecialCube1 is : " + specialObj1.weight);

        System.out.println("Volume of SpecialCube2 is : " + specialObj2.getVolume());
        System.out.println("Weight of SpecialCube2 is : " + specialObj2.weight);

    }

}
