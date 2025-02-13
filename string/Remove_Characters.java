import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Remove_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String s=sc.nextLine();
        System.out.println("Enter second string");
        String s2=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        Queue<Character> q=new LinkedList<>();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            q.add(s.charAt(i));
        } 

        for(int i=0;i<s2.length();i++){
            hs.add(s2.charAt(i));
        }

        while(!q.isEmpty()){
            char ch=q.remove();
            if(!hs.contains(ch)){
               sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
