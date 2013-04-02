/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

import com.ssmith1975.mylib.*;
import java.util.*;




public class Fractions2 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = 12 ;
       int num2 = 18;
       int lcm, gcf;
       //int[] factors1 = null;
       //int[] factors2 = null;

       Fraction myFraction = new Fraction(2,3,12);
       Fraction myFraction2 = new Fraction(1,5,18);
       Fraction myFraction3 = new Fraction(2,2);
       //Fraction reducedMyFraction = myFraction.reduce();
       Fraction addedFraction = myFraction.addFraction(myFraction2);

       System.out.println("myFraction: "+ myFraction.toString());
       System.out.println(myFraction.toString() +" (reduced): "+ myFraction.reduce().toString());
       System.out.println(myFraction.toString() +" (reciprocal): "+ myFraction.makeReciprocal().toString());
       System.out.println(myFraction2.toString() + " (improper form): " + myFraction2.makeImproper().toString());
       System.out.println(myFraction3.toString() + "(mixed form): " + myFraction3.makeMix().toString());
       
       System.out.println("\n\n");
       System.out.println("LCD of "+myFraction.toString() + " and " + myFraction2.toString() + " = " + myFraction.findLCD(myFraction2));
       System.out.println(myFraction.toString() + " + " + myFraction2.toString() + " = " + addedFraction.toString());
       System.out.println(myFraction.toString() + " - " + myFraction2.toString() + " = " + myFraction.subtractFraction(myFraction2).toString());
       System.out.println(myFraction.toString() + " x " + myFraction2.toString() + " = " + myFraction.multiplyFraction(myFraction2).toString());
       System.out.println(myFraction.toString() + " / 3/4 = " + myFraction.divideFraction(new Fraction (3,4)).toString());

       System.out.println("Enter a number to compute primes for: ");
       Scanner value = new Scanner(System.in);
       int myPrimes = value.nextInt();
       System.out.println("");
       System.out.print("Prime factors of "+ myPrimes+": ");
       FractionCalculator.printFactors(myPrimes);
       System.out.println("");
       myFraction.makeImproper().printFactors();
       System.out.println("");
       //System.out.println("");
/*
       factors1 = FractionCalculator.findFactors(num1);
       factors2 = FractionCalculator.findFactors(num2);

       System.out.println("Factors of "+num1+":");
       for(int value: factors1){
           System.out.print(value+ " x "+ num1/value + "  ");
       }
       System.out.println("\n");

       System.out.println("Factors of "+num2+":");
       for(int value: factors2){
           System.out.print(value+ " x " + num2/value + "  ");
       }

 */
       System.out.println("\n\n");

       lcm = FractionCalculator.findLCM(num1, num2);
       gcf = FractionCalculator.findGCF(num1, num2);
       System.out.println("LCM for "+num1+ " and "+num2+": "+ lcm);
       //System.out.println(s1);
       System.out.println(num1 + " x " + lcm/num1 + " = "+ lcm);
       //System.out.println(s2);
       System.out.println(num2 + " x " + lcm/num2 + " = " + lcm);
       
       System.out.println("\n");
       System.out.println("GCF for "+num1+ " and "+num2+": "+ gcf);
       System.out.println(num1 + "/"+ gcf +" = " + num1/gcf);
       System.out.println(num2 + "/"+ gcf +" = " + num2/gcf);

       System.out.println("\n");
       System.out.println("Random num between 1 to 10: "+ RandomRange.getRandom(1,10));
       // int primeNum = 3;
       //System.out.println(primeNum + " Prime? "+ MyFraction.isPrime(primeNum));
       
      // Fraction myFrac = new Fraction(6,8);
       
       
    }

}
