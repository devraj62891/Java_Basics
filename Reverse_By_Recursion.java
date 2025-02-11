import java.util.Scanner;

public class Reverse_By_Recursion {
    static void reverse(int n){
        int r=0;
        System.out.println(n%10);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n=sc.nextInt();
        reverse(n);
    }
}
