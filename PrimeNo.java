import java.util.*;

public class PrimeNo {
    static boolean checkPrime(int a){
        if(a==1 || a==0){
            return false;
        }else {
            for(int i=2;i<Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter a no.");
            a=sc.nextInt();
        

        boolean c=checkPrime(Math.abs(a));
        if(c){
            System.out.print("Prime no.");
        }else{
            System.out.print("Not a prime no.");
        }
    }
}
