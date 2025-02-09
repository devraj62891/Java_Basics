import java.util.Scanner;

public class ReverseDigits {
    static int rev(int n){
        int temp=0;
        while(n>0){
            int d=n%10;
            temp=temp*10+d;
            n=n/10;
        }

        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        System.out.println(rev(n));
    }
}
