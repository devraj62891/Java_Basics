import java.util.Scanner;

public class binary_to_decimal {
    static int decimal(int n){
        int sum=0;
         int t=n;
         int i=0;
         while(t>0){
            int d=t%10;
            sum+=d*Math.pow(2,i);
            i++;
            t=t/10;
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary no.");
        int n=sc.nextInt();
        int d=decimal(n);
        System.out.println("The decimal form is "+d);
    }
}
