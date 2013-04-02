/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class Car extends Object {
    void carMethod() {
    
    }
}

class HeavyVehicle extends Object {
    
}

class Ford extends Car {
    void fordMethod() {
        System.out.println("I am fordMethod defined in class Ford");
    }
}

class Honda extends Car {
    void fordMethod() {
        System.out.println("I am a fordMethod defined in class Ford");
    }
}

public class ObjectCasting {
    // Casting Object References: Implicit Casting using a Compiler
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car obj = new Ford();
        // Following will result in compilation error
        // obj.fordMethod(); // As the method fordMethod is undefined for the Car Type
    
        // Following will result in compilation error
        // (HeavyVehicle).obj.fordMethod(); // fordMethod is undefined in the HeavyVehicle Type

        // Following will result in compilation error
        // Honda hondaObj = (Ford)obj; Cannot convert as they are siblings
        
        
        // Following will compile and run
        ((Ford) obj).fordMethod();
    }   
    

}
