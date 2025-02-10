import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find factorial");
        int n=sc.nextInt();
        int f=fact(n);
    System.out.println(f);
    }
}
