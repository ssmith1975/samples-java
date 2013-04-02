/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kush
 */

class Counter {
    int i = 0;
    Counter increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
}

public class CounterDemo extends Counter {
    // this and super keywords
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter x = new Counter();
        x.increment().increment().increment().print();
    }

}
