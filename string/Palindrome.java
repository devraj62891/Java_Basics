import java.util.Scanner;

public class Palindrome {
    static boolean check(String s){
        int f=0;
        int l=s.length()-1;
        while(f<=l){
            if(s.charAt(l)!=s.charAt(f)){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    boolean c=check(s);
    System.out.println(c);
 }   
}
