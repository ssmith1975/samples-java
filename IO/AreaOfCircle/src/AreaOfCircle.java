/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;

public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius;

        System.out.println("Input the radius: ");
        radius = scan.nextInt();

        System.out.println("The radius is: "+ radius + " The area is: "+ Math.PI*radius*radius);

        
    }

}
