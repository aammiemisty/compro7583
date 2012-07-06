/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class Narrowing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 32768;
        short s = (short) i;
        System.out.println("i = " + i + ", s = " + s); // i = 32768, s = -32768
        // TODO code application logic here
    }
}
