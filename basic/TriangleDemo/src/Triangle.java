/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 * This class describes triangle objects that can be displayed
 * as shapes like this:
 * []
 * [][]
 * [][][]
 */


public class Triangle {
    /**
     * Construct a triangle.
     * @param aWidth the number of [] in the last row of the triangle
     */
    private int width;

    public Triangle(int aWidth) {
        width = aWidth;
    }

    /**
     * Computes a string representing the triangle.
     * @return a string consisting of [] and newline characters
     */
    public String toString() {
        String r = "";
//        for (int i=1; i<=width; i++) {
//            // Make triangle row
//            for (int j=1; j<=i; j++){
//                r = r + "[]";
//            }
//            r = r + "\n";
//        }

        for (int i=0; i<=(width-1)/2; i++) {
            // Make triangle row
            for (int j=0; j<width; j++){
                
                if(j>=(width-1)/2-i && j<=(width-1)/2+i) {
                    r = r + " *";
                } else {
                    r= r + "  ";
                }
            }

            r = r + "\n";
        }

        return r;
    }

}
