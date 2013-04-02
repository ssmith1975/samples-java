/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ssmith1975.mylib;

import java.util.*;

/**
 *
 * @author Kush
 */
public class FractionCalculator {

    // Prime Number?
    public static boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i < x; i++) {

            if ((x % i) == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Lowest Common Multiple
    public static int findLCM(int num1, int num2) {
        int lcm = 1;
        int i = 1;
        int smallerNum = Math.min(num1, num2);
        int biggerNum = Math.max(num1, num2);
        while (i <= biggerNum) {
            if (i * smallerNum % biggerNum == 0) {
                lcm = i * smallerNum;
                break;
            }
            i++;
        }

        return lcm;
    }

    // Find Greatest Common Factor
    public static int findGCF(int num1, int num2) {
//        int gcf = 1;
//
//        int i = 0;
//        int smallerNum = Math.min(num1, num2);
//        int biggerNum = Math.max(num1, num2);
//        while (i < biggerNum) {
//            if (biggerNum % (biggerNum - i) == 0 && smallerNum % (biggerNum - i) == 0) {
//                gcf = biggerNum - i;
//                break;
//            }
//            i++;
//        }
//        return gcf;
        
        if (num2==0) {
            
            return num1;
        } else {
            return findGCF(num2, num1 % num2);
        }
       
    }

    // Find Factors
    public static int[] findFactors(int x) {

        int count = 0;

        SortedSet s = new TreeSet();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                s.add(new Integer(i));
                count++;
            }
        }

        int[] factorList = new int[count];
        Iterator it = s.iterator();

        int index = 0;

        while (it.hasNext()) {
            factorList[index] = (Integer) it.next();
            index++;
        }

        return factorList;
    }
    
    // Prime Factorziation
    public static int[][] findPrimeFactors(int x){
        int i = 2;
      
        int[][] tempArray = new int[x][2];
       

        int index =0;
        while(i<=x) {
            int n = 1;
            
            if(FractionCalculator.isPrime(i)&& (x % i == 0)){
                int[] prime = new int[2];
                while(x % Math.pow(i,n+1) == 0){  
                    n++;
                }

                tempArray[index][0] = i;
                tempArray[index][1] = n;
               
                index++;
            }

            i++;
        }

        int[][] pFactor = new int[index][2];
        for(int k=0; k < index; k++) {
            pFactor[k][0] = tempArray[k][0];
            pFactor[k][1] = tempArray[k][1];
        }
   
        return pFactor;

    }

        public static void printFactors(int x) {

            int[][] primes = FractionCalculator.findPrimeFactors(x);
            System.out.print("[");
           for (int i=0; i<primes.length; i++){
                //System.out.print(num.prime + "^"+ num.exponent+ "   ");
                if(i<primes.length-1){
                    System.out.print(primes[i][0]+"^"+primes[i][1]+ " x ");
               } else {
                    System.out.print(primes[i][0]+"^"+primes[i][1]);
               }
           }
            System.out.print("]");

        }

}
