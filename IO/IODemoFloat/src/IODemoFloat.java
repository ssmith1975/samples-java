/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.text.*;

public class IODemoFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double value = 12345.6789;
        DecimalFormat numform = new DecimalFormat();
        System.out.println("value = " + numform.format(value));
    }

}
