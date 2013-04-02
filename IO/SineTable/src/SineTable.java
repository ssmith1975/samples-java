/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.text.*;

public class SineTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat numform1 = new DecimalFormat(" #00.0#;-#00.0#");
        DecimalFormat numform2 = new DecimalFormat(" #0.0##### ;-#0.0#####");

        System.out.println("angle \t sine");
        System.out.println("----- \t -------");

        for(double i = -90.0; i<=90.0; i+=15.0) {
            System.out.println(numform1.format(i) + "\t"+ numform2.format(Math.sin(i*Math.PI/180)));
        }
    }

}
