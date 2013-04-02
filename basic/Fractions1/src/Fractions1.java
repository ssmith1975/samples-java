/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */
import java.util.List;
import java.util.ArrayList;


public class Fractions1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 4;
        int factor1=1, factor2=1;

        List<Integer> ArrList1 = new ArrayList<Integer>();
        List<Integer> ArrList2 = new ArrayList<Integer>();

        //int[] arrN1 = new int[num2];
        //int[] arrN2 = new int[num1];

        System.out.print("Multiples of "+num1+": ");
        for (int i=0; i<num2; i++) {
            ArrList1.add((i+1)*num1);
            System.out.print(ArrList1.get(i)+" ");
        }
        System.out.println("");
        System.out.print("Multiples of "+num2+": ");
        for (int j=0; j<num1; j++) {
            ArrList2.add((j+1)*num2);
            System.out.print(ArrList2.get(j)+" ");
        }

  

        for (Integer num1Index: ArrList1){
            int index = -1;
            index = ArrList2.indexOf(num1Index);

            if(index>-1){
                factor2 = index+1;
                break;
            }
        }

        for (Integer num2Index: ArrList2) {
            int index = -1;
            index = ArrList1.indexOf(num2Index);

            if(index>-1){
                factor1 = index + 1;
                break;
            }
        }

 

        System.out.println("");
        System.out.println("");
        System.out.println("LCM for "+num1+" and "+num2 +" is "+ factor2*num2);
        System.out.println(num1+" x "+ factor1 + " = "+num1*factor1);
        System.out.println(num2+" x "+ factor2 + " = "+num2*factor2);

  
        
        
        
    }

}
