import java.util.Scanner;

public class Reverse_word{
    static void rev(String s){
       String stAr[]=s.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=stAr.length-1;i>=0;i--){
        sb.append(stAr[i]);
        sb.append(" ");
       }

       String n=sb.toString().trim();
       System.out.println(n);

        
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s=sc.nextLine();
    rev(s);
   }
}