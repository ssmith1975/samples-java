/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;
import java.text.*;

public class FinancialInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double initDeposit, interest,  interestPerYear, years, value;
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("$0.00");

        System.out.println("Initial deposit: ");
        initDeposit = scan.nextDouble();

        System.out.println("Interest rate as fraction (eg 0.05): ");
        interest = scan.nextDouble();

        System.out.println("Number of times per year interest: ");
        interestPerYear = scan.nextDouble();

        System.out.println("Number of years: ");
        years = scan.nextDouble();

        value = initDeposit * Math.pow((1 + interest/interestPerYear),years * interestPerYear);
        System.out.println("Value: "+ numform.format(value));

    }

}
