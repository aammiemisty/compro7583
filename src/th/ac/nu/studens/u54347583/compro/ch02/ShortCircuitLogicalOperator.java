/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class ShortCircuitLogicalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        System.out.println((x != 0) && ((10 / x) > 1)); //false
        // TODO code application logic here
    }
}
