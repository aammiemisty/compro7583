/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.studens.u54347583.compro.ch01;

/**
 *
 * @author User
 */
public class ArrayPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 8, 13};
        int index, initial = 0;
        for (index = initial; index < numbers.length; index++) {
            System.out.println("numbers[" + index + "] = " +
                    numbers[index]);
        }
        // TODO code application logic here
    }
}
