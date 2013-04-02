/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.Scanner;
import java.io.*;

public class Input2Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("myData.txt"); // create File object
        Scanner scan = new Scanner(file); // connect to a Scanner
        int num, square;

        while ( scan.hasNextInt() ) {
            num = scan.nextInt();
            square = num * num;
            System.out.println("The square of " + num + " is " + square);
        }

    }

}
