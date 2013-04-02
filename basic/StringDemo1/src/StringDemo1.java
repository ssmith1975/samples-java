/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
public class StringDemo1 {
// Java.lang.String class creation
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] bytes = {2,4, 6, 8};
        char[] characters = {'a', 'b', 'C', 'D'};
        StringBuffer strBuffer = new StringBuffer("abcde");

        // Examples of Creating of Strings
        String byteStr = new String(bytes);
        String charStr = new String(characters);
        String buffStr = new String(strBuffer);

        // String output
        System.out.println("byteStr :" + byteStr);
        System.out.println("charStr :" + charStr);
        System.out.println("buffStr :" + buffStr);

    }

}
