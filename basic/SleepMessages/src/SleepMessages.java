/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
public class SleepMessages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
          "Mares eat oats",
          "Does eat oats",
          "Little lambs est ivy",
          "A kid will eat ivy too"
        };

        for (String myInfo: importantInfo){
            // Pause for 4 seconds
            Thread.sleep(4000);
            
            // Print a message
            System.out.println(myInfo);

        }
    }

}
