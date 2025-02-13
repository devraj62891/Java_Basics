import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            hs.add(ch);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
                sb.append(ch);
                hs.remove(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
