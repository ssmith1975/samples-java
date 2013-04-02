/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.io.*;

public class PrintSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("mySquare.txt");
        PrintStream print = new PrintStream(file);

        double x = 1.7320508;

        print.println("The square of " + x + " is " + x*x);
        print.close();
    }

}
