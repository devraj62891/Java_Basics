import java.util.Scanner;

public class sum_in_range {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ranges");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
          sum+=i;
        }

        System.out.println(sum);
    }
}