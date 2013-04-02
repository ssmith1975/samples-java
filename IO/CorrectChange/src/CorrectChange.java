/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;
public class CorrectChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount, dollars, quarters, dimes, nickels, cents;

        System.out.println("Enter your amount (cents): ");
        amount = scan.nextInt();

        dollars = amount/100;
        cents = amount % 100;

        quarters = cents/25;
        cents = cents % 25;

        dimes = cents /10;
        cents = cents % 10;

        nickels = cents/5;
        cents = cents % 5;

        System.out.println("Your chsnge is: "+ dollars + " dollar(s), "+ quarters + " quarter(s), "+ dimes + " dime(s), "+ nickels + " nickel(s), and " +cents+ " cent(s).");
        

    }

}
