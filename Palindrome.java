import java.util.*;
public class Palindrome {
    static boolean checkPalindrome(int a){
        int temp=Math.abs(a);
        a=Math.abs(a);
        int c=0;
        while(a>0){
          int t=a%10;
          c=c*10+t;
          a=a/10;
        }
        if(c==temp){
            return true;
        }
        
      return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int a;
    System.out.println("enter a number");
    a=sc.nextInt();
    boolean b=checkPalindrome(a);
    System.out.print(b);
    }
    
}
