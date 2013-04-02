/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Locale;
import java.text.*;

public class IODemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 123456789;

        System.out.println("Default Local = " + Locale.getDefault());
        DecimalFormat decform = new DecimalFormat();
        System.out.println("value =  " + decform.format(value));
    }

}
