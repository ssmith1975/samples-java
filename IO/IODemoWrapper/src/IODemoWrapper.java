/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.text.*;

public class IODemoWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = new Integer(7654321);
        Double  d = new Double(11000.0008);

        DecimalFormat numform = new DecimalFormat();

        System.out.println("integer = " + numform.format(i) + " double = " + numform.format(d));
    }

}
