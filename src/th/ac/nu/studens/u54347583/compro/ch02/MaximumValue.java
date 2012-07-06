/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class MaximumValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 2147483647;
        System.out.println(num1);   // 2147483647
        System.out.println(num1+1);   // -2147483648
        int num2 = -2147483648;
        System.out.println(num2);   //-2147483648
        System.out.println(num2-1);   // 2147483647
        // TODO code application logic here
    }
}
