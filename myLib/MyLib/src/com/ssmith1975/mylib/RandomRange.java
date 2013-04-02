/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ssmith1975.mylib;
import java.util.Random;
/**
 *
 * @author Kush
 */
public class RandomRange { 
   
    public static int getRandom(int low, int high) {
        Random myRandom = new Random();
        return myRandom.nextInt(high - low + 1)+ low;
    }
}
