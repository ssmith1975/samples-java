/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CentralProcessing;

/**
 *
 * @author Kush
 */
public class Central {
    public static Surfaces.Square create() {
        Surfaces.Square geometric = new Surfaces.Square(48.26);
        return geometric;
    }
    public static void show(Surfaces.Square figure) {
        System.out.println("\nSquare Characteristics");
        System.out.printf("Side:      %.3f\n", figure.getSide());
        System.out.printf("Perimeter: %.3f\n", figure.calculatePerimeter());
        System.out.printf("Area:      %.3f\n", figure.calculateArea());
    }

    public static void main(String args[]) {
        Surfaces.Square sqr = create();

        show(sqr);
    }

}
