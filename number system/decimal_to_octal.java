import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("Enter a decimal no.");
        int n=sc.nextInt();
        while(n>0){
            int d=n%8;
            sb.append(d);
            n=n/8;
        }

        System.out.println(sb.reverse());
    }
}
