import java.util.HashSet;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NO.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                hs.add(i);
            }
        }
        int hcf=1;
        for(int i=1;i<=b;i++){
            if(b%i==0 && hs.contains(i)){
                hcf=i;
            }
        }

        System.out.println("The gcd of these two no. is "+hcf);
    }
}
