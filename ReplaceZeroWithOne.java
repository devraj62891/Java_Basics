import java.util.Scanner;

public class ReplaceZeroWithOne {
    static int reverse(int n){
        int f=0;
        while(n>0){
            int d=n%10;
            f=f*10+d;
            n=n/10;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no. ");
        int n=sc.nextInt();

        int newNo=0;
        while(n>0){
            int d=n%10;
            if(d==0){
            newNo=10*newNo+1;

            }else{

                newNo=10*newNo+n%10;
            }
            n=n/10;
        }

       newNo= reverse(newNo);
        System.out.println(newNo);
    }
}
