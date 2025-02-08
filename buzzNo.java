import java.util.*;
public class buzzNo {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        a=sc.nextInt();
        if(a%7==7 || a%7==0){
      System.out.print("buzz no.");
        }else{
            System.out.println("Not a buzz no.");
        }
    }
}
