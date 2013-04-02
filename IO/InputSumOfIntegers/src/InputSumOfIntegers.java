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

public class InputSumOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int num, sum;
        String inputFileName;

        Scanner user = new Scanner(System.in);
        System.out.print("Enter Input File Name: ");
        inputFileName = user.nextLine().trim();

        File file = new File(inputFileName);
        Scanner scan = new Scanner(file);

        sum = 0;
        while( scan.hasNextInt() ) {
            num = scan.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of integers from file " + inputFileName + " is "+ sum);



    }

}
