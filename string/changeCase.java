import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }else{
                    sb.append(Character.toUpperCase(ch));

                }

            }else{
                sb.append(ch);
            }
        }

        String ns=sb.toString();
        System.out.println(ns);
    }
}
