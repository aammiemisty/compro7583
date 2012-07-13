package th.ac.nu.studens.u54347583.compro.ch02;
import java.util.Scanner;

public class P2_3Exercises{
    public static void main (String [] args){
        double meters;
        double miles;
        double foot;
        double inches;
        meters = 9;
        miles = 0.0006;
        foot = 3.2808;
        inches = 39.3700787;
        Scanner s = new Scanner (System.in);
        
        System.out.print(" Enter meters:");
        meters = s.nextDouble();
        
        System.out.println("miles:"+meters*miles);
        System.out.println("foot:"+meters*foot);
        System.out.println("inches:"+meters*inches);
    }
}