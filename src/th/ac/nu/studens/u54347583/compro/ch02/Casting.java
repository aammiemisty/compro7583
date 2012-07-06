/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d = 257.234;
        int i = (int) d;
        System.out.println(i); // 257
        byte b = (byte) d;
        System.out.println(b); // 1 (257%256)
        // TODO code application logic here
    }
}
