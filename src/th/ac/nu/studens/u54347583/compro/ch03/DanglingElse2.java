package th.ac.nu.studens.u54347583.compro.ch03;

public class DanglingElse2 {
    public static void main(String[] args) {
        int x = 5;
        if (x < 5)
            if (x > 5)
                System.out.println('b');
        else
                System.out.println('a');
    }
}