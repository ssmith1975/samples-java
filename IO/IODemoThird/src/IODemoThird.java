/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.text.*;

public class IODemoThird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat numform = new DecimalFormat("0.000000");
        System.out.println("Thrid = " + numform.format(1.0/3.0));
    }

}
