/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.io.*;

public class PrintTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File( "myOutput.txt" );
        PrintStream print = new PrintStream( file );

        print.println( "The world is so full" );
        print.println( "Of a numer of things." );
        print.println( "I'm sure we should all" );
        print.println( "Be as happy as kings." );

        print.close();
 
    }

}
