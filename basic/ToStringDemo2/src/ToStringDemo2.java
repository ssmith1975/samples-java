/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class PointCoordinates {
    private int x, y;
    public PointCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // Custom toString() Method.
    public String toString() {
        return "X=" + x + " " + "Y=" + y;
    }
}
public class ToStringDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PointCoordinates point = new PointCoordinates(10,10);
        System.out.println(point);

        String s = point + " testing";
        System.out.println(s);
    }

}
