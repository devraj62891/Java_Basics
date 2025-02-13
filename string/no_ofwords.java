import java.util.Scanner;

public class no_ofwords {
    static int find(String s){
   
        String str[]=s.split(" ");
        return str.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int count=find(s);
        System.out.println(count);
    }
}
