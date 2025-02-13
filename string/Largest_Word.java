import java.util.Scanner;

public class Largest_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int max=0;
        String st="";
        String str[]=s.split(" ");
        for(String val:str){
            int currMax=val.length();
            if(currMax>max){
               st=val;
               max=currMax;
            }
        }
     
        System.out.println(st);
    }
}
