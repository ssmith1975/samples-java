/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ssmith1975.mylib;
import com.ssmith1975.mylib.PrimeFactors;
/**
 *
 * @author Kush
 */
public class Fraction {

            public int numerator;
            public int denominator;
            public int wholePart;

            public Fraction() {
                numerator = 1;
                denominator = 1;
            }
            public Fraction(int num, int den) {
                numerator = num;
                denominator = den;
                wholePart = 0;
            }

            public Fraction(int whole, int num, int den) {
                numerator = num;
                denominator = den;
                wholePart = whole;
            }


            public boolean isProper() {

                if((numerator < denominator) && !hasWholePart()) {
                    return true;
                } else {
                    return false;
                }

            }
            public boolean isImproper() {
                if((numerator > denominator) && !hasWholePart()) {
                    return true;
                } else {
                    return false;
                }
            }

            public boolean isEquivalent(Fraction f) {
                double nfactor;
                double dfactor;

                nfactor =  (double)(this.numerator)/(double)(f.numerator);
                dfactor = (double)(this.denominator)/(double)(f.denominator);
                if(nfactor == dfactor) {
                    if(this.wholePart == f.wholePart){
                        return true;
                    } else {
                        return false;
                    }
                } else {                    
                    return false;
                }
            }


            public boolean hasWholePart() {
                if (wholePart != 0) {
                    return false;
                } else {
                    return true;
                }
            }
            public Fraction reduce(){
               int gcf = FractionCalculator.findGCF(numerator, denominator);

               return new Fraction(numerator/gcf, denominator/gcf);
            }
        
            public Fraction makeImproper() {

                return new Fraction(wholePart*denominator+numerator, denominator);
                
            }
            public Fraction makeMix() {
                int whole;
                whole = (int)(numerator/denominator);
                return new Fraction(whole, numerator-denominator, denominator);
            }
            public Fraction makeReciprocal() {
                return new Fraction(denominator, numerator);
            }

            public int findLCD(Fraction f) {
                return FractionCalculator.findLCM(denominator, f.denominator);
            }

            /* Fraction Arithmatic */
            public Fraction addFraction(Fraction f) {
                int lcm = FractionCalculator.findLCM(f.denominator, denominator);
                return new Fraction(wholePart+f.wholePart, numerator*(lcm/denominator)+f.numerator*(lcm/f.denominator), lcm);
            }

            public Fraction subtractFraction(Fraction f) {
                int lcm = FractionCalculator.findLCM(f.denominator, denominator);

                if(hasWholePart() && (numerator < f.numerator)){
                    return new Fraction(wholePart-f.wholePart-1, lcm+numerator*(lcm/denominator) -f.numerator*(lcm/f.denominator), lcm);
                } else {
                    return new Fraction(numerator*(lcm/denominator)-f.numerator*(lcm/f.denominator), lcm);
                }
                
                
            }

            public Fraction multiplyFraction(Fraction f) {
                return new Fraction(numerator * f.numerator, denominator*f.denominator);
            }
            public Fraction divideFraction(Fraction f) {
                return multiplyFraction(f.makeReciprocal());
            }

            /* Print Fraction */
            public String toString() {
                if (!hasWholePart()) { // proper and improper fractions
                    return numerator + "/" + denominator;
                } else if (hasWholePart() && numerator >0){ // mixed fractions
                    return wholePart + " " + numerator + "/" + denominator;
                } else { // whole numbers
                    return wholePart+"";
                }
            }
            public void printFactors() {
                int[][] numPrimes = FractionCalculator.findPrimeFactors(numerator);
                int[][] denPrimes = FractionCalculator.findPrimeFactors(denominator);
                
                System.out.print("[(");
                for (int i = 0; i< numPrimes.length; i++){
                    if(i<numPrimes.length-1){
                        System.out.print(numPrimes[i][0] + "^"+ numPrimes[i][1] + " x ");
                    } else {
                        System.out.print(numPrimes[i][0] + "^"+ numPrimes[i][1]);
                    }
                }
                System.out.print(")/(");
                for (int i = 0; i< denPrimes.length; i++){
                    if(i<denPrimes.length-1){
                        System.out.print(denPrimes[i][0] + "^"+ denPrimes[i][1] + " x ");
                    } else {
                        System.out.print(denPrimes[i][0] + "^"+ denPrimes[i][1]);
                    }
                }

                System.out.print(")]");
                
            }

            /* Getter and Setter Methods */
            public void setWholePart(int whole) {
                wholePart = whole;
            }
            public void setNumerator(int num) {
                numerator = num;
            }
            public void setDenominator(int den) {
                denominator = den;
            }
            public int getWholePart() {
                return wholePart;
            }
            public int getNumerator() {
                return numerator;
            }
            public int getDenominator() {
                return denominator;
            }
/* Override */
    public boolean equals(Object obj) {

        /* is obj reference this object being compared */
        if (obj == this) {
            return true;
        }


        /* is obj reference null */
        if (obj == null) {
            return false;
        }

        /* Make sure references are of same type */
        if (!(this.getClass() == obj.getClass())) {
            return false;
        } else {
            Fraction tmp = (Fraction)obj;
            if ( (tmp.numerator==this.numerator)
                 &&
                 (tmp.denominator==this.denominator)
                 &&
                 (tmp.wholePart==this.wholePart)
                 ) {
                return true;
            } else {
                return false;
            }
        }
    }



}
