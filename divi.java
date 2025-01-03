import java.util.*;
class divi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=100 &&a<=999){
            if(a%9==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}