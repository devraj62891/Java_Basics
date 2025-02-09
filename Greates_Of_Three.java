import java.util.Scanner;

public class Greates_Of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c)+" iss greatest");
    }
}
