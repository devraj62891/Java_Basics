import java.util.Scanner;

public class Max_Min_Digit {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a no.");
    int n=sc.nextInt();
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    while(n>0){
        int d=n%10;
          min=Math.min(min,d);
          max=Math.max(max,d);
          n=n/10;
    }

    System.out.println("Maximum digit is "+max);
    System.out.println("Minimum digit is "+min);
 }   
}
