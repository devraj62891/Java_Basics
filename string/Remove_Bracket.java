import java.util.Scanner;

public class Remove_Bracket {
    static String find(String s){
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='(' && ch!=')'){
                 sb.append(ch);
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
