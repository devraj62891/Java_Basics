import java.util.Scanner;

public class Greatest_Of_Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.max(a,b)+" is the greatest");
    }
}
