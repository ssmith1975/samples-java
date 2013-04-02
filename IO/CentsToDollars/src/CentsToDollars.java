/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;

public class CentsToDollars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount;
        int dollars, cents;

        System.out.println("Input the cents: ");
        amount = scan.nextInt();

        dollars = amount/100; // integer division
        cents = amount % 100;

        System.out.println("That is "+ dollars + " and "+ cents + " cents.");
    }

}
