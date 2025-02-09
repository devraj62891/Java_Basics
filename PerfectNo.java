import java.util.*;
public class PerfectNo {
    static void perf(int n){
        int temp=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                temp+=i;
            }
        }

        if(temp==n){
            System.out.println("It is a perfect no.");
        }else{
            System.out.println("It is not a perfect no.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        perf(n);
    }
}
