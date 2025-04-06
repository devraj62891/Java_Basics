// Q1. Mike is travelling on a flight, and he was curious to see the 3 characters codes on the ticket. He has a String s of length N(multiple of 3) and he has to split the string in a such way that each partition is 3 characters long, which may resemble any airport code. The subset should not overlap the partitioning, which means the partition should be something like from length 1-3,4-6 and so on. For mike, ABC is the same as BAC, as they contain the same letters. So, he is interested in knowing how many unique codes exist in the given string S. Your task is to find and return an integer value representing the unique number of 3 characters code present in the string if it is split in each group of 3.

// Note:

// The String s only contain upper-case English letters

// N is always a multiple of 3

// Input Specifications:

// Input1: A integer value N representing the length of string S

// Input2: A string value S representing the airport codes
import java.util.*;
public class airport {
    static String rev(String s){
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
       String s2=new String(ch);
        return s2;
    }
    static int ap(String s, int n){
        int c=0;
        HashSet<String> hs=new HashSet<>();
        int i=0;
        int j=2;
        while(j<s.length()){
            String t=s.substring(i,j+1);
            char [] ch=t.toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);


            if(!hs.contains(ss) ){
                c++;
                hs.add(ss);
              
                i++;
                i++;
                i++;
                j=j+3;
            }else{
                i=i+3;
                j=j+3;
            }
        }
      return c;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the string and length of the string");
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.err.println(ap(s,n));

        
    }
}