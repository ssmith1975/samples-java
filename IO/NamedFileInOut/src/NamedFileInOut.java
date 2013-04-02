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

public class NamedFileInOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int num, square;

        // Scanner for user input
        Scanner user = new Scanner(System.in);
        String inputFileName, outputFileName;

        // prepare the input file;
        System.out.print("Input File Name: ");
        inputFileName = user.nextLine().trim();
        File input = new File(inputFileName);
        Scanner scan = new Scanner(input);

        // prepare the output file
        System.out.print("Output File Name: ");
        outputFileName = user.nextLine();
        File output = new File(outputFileName);
        PrintStream print = new PrintStream(output);

        // processing loop
        while ( scan.hasNextInt() ){
            num = scan.nextInt();
            square = num * num;
            print.println("The square of " + num + " is "+ square);
        }

        // close the output file
        print.close();


    }

}
