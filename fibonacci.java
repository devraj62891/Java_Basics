import java.util.Scanner;

public class fibonacci {
    static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of fibbonacci to print");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibbo(i)+" ");
        }
    }
}
