package th.ac.nu.studens.u54347583.compro.ch03;

public class SwitchBlock {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            // int y;
            case 1:
                int a;
                System.out.println(0);
                break;
            case 2: {
                int b;
                System.out.println(1);
                break;    
            }
            default:
                System.out.println(2);
        }
    }
}