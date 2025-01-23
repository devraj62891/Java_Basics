// Problem Statement: Given a string, write a program to Capitalize the first and last character of each word of that string.

// Examples:

// Example 1:
// Input: String str = "take u forward is awesome"
// Output: “TakE U ForwarD IS AwesomE”
// Explanation: We get the result after capitalizing the first and last character of each word of a string

// Example 2:
// Input: String str = "Take u Forward is Awesome"
// Output: “TakE U ForwarD IS AwesomE”
// Explanation: Characters T, F, A are initially in uppercase , so they remain as they are in the result.

import java.util.LinkedList;
import java.util.Queue;

public class Captilize_First_Word {
    public String doCaps(String s){
       Queue<String> q=new LinkedList<>();
       StringBuilder sb=new StringBuilder();
       String[] st=s.split(" ");
       for(int i=0;i<st.length;i++){
        String curr=st[i];
        q.add(curr);
       }

       while(!q.isEmpty()){
        char[] ch=q.remove().toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);
        ch[ch.length-1]=Character.toUpperCase(ch[ch.length-1]);
        sb.append(new String(ch));
        sb.append(" ");
       }

       return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s="take u forward is awesome";
        Captilize_First_Word obj=new Captilize_First_Word();
        String ns=obj.doCaps(s);
        System.out.println(ns);
    }
}
