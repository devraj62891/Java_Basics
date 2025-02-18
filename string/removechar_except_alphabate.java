import java.util.Scanner;

public class removechar_except_alphabate {
    static String find(String s){
        StringBuilder sb=new StringBuilder();
        char ch[]=s.toCharArray();
        for(char c:ch){
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }

        return (new String(sb));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String ns=find(s);
        System.out.println(ns);
    }
}
