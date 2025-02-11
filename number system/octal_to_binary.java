import java.util.Scanner;

public class octal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("enter an octal no");
        int n=sc.nextInt();
        int d=0;
        int i=0;
       

        int t=n;
        while(t>0){
            int power=(int)Math.pow(8,i++);
            d+=(t%10)*power;
            t/=10;

        }
        
    if(d==0){
        sb.append(d);
    }else{

        while(d>0){
         sb.append(d%2);
         d=d/2;
        }
    }
    sb.toString();
    sb.reverse();



        System.out.println(sb);
    }
}
