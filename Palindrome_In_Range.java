
import java.util.*;
public class Palindrome_In_Range {
    static boolean checkPalin(int a){
        int c=0;
        int temp=a;
        while(a>0){
            int f=a%10;
            c=c*10+f;
            a=a/10;
        }

        if(c==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter min aand max range");
        int min=sc.nextInt();
        int max=sc.nextInt();

        for(int i=min;i<=max;i++){
            if(checkPalin(i)){
                System.out.print(i+" ");
            }
        }
    }
}
