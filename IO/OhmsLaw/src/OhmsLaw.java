/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;

public class OhmsLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V, R;
        double I;

        System.out.println("Enter Voltage (volts): ");
        V = scan.nextInt();

        System.out.println("Enter Resistance (ohms): ");
        R = scan.nextInt();
        
        I = (V + 0.0)/R;

        System.out.println("Current flowing through is: "+ I +" amps.");

    }

}
