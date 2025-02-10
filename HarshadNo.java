import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }

        if(temp%sum==0){
            System.out.println("Harshadno");
        }else{
            System.out.println("Not a harshad no");
        }
    }
}
