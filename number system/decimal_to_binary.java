import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a decimal no. ");
        int n=sc.nextInt();
        StringBuilder b=new StringBuilder();
        while(n>0){
            int d=n%2;
            b=b.append(d);
            n=n/2;
        }
        b.reverse();
       

        System.out.println(b);
    }
}
