/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class AssignmentOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        //x = 1, y = 1, z = 1
        
        x = (y = (z = z + 1) + 1) + 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        //x = 4, y = 3, z = 2
        
        x = (y = 1) + (z = 1);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        //x = 2, y = 1, z = 1
        // TODO code application logic here
    }
}
