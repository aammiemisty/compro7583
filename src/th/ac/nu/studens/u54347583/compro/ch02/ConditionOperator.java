/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch02;

/**
 *
 * @author User
 */
public class ConditionOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println((a>b)? a : b);
        }
        // TODO code application logic here
    }
}
