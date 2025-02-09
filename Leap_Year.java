import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int y=sc.nextInt();
       if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println(" leap year");
            }
       }else{
        System.out.println("Not a leap year");
       }
    }
}
