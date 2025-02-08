import java.util.*;

public class Armstrong_Number {
    static int findPower(int n) {
        int p = 0;
        while (n > 0) {
            p++;
            n = n / 10;

        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to");
        int n = sc.nextInt();

        int p = findPower(n);
        int fn = 0; // finalnumber
        int t = n;

        while (t > 0) {
            fn += Math.pow(t % 10, p);
            t = t / 10;
        }

        if (fn == n) {
            System.out.println("yes it is armstrong");
        } else {

            System.out.println("no it is not armsstrong");
        }

    }
}