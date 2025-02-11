import java.util.Scanner;

public class binary_to_octal {
    static int binToDec(int n) {
        int i = 0;
        int t = n;
        int sum = 0;
        while (t > 0) {
            int d = t % 10;
            sum += d * Math.pow(2, i);
            i++;
            t = t / 10;

        }
        return sum;
    }

    static int deToOc(int n) {
       int s=0;
       while(n>0){
        int d=n%8;
        s=(s*10)+d;
        n=n/8;
       }
       int rev=0;
       while(s>0){
        int d=s%10;
         rev=rev*10+d;
         s=s/10;
       }
       return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary no.");
        int n = sc.nextInt();
        int d = binToDec(n);
        int o = deToOc(d);
        System.out.println("Octal number is " + o);
        sc.close();
    }
}
