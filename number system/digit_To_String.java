import java.util.Scanner;

public class digit_To_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();

        if(n<1 || n>19){
            System.out.println("Invalid no.");
        }else{
            String sd[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twleve","thirteen","fourteen","fifeteen","sixteen","seventeen","eighteen","nineteen"};
            System.out.println(sd[n]);
        }
    }
}
