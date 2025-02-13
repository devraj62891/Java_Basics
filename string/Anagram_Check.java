import java.util.HashMap;
import java.util.Scanner;

public class Anagram_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println(false);
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        hm1.put(s1.charAt(0),1);
        HashMap<Character,Integer> hm2=new HashMap<>();
        hm2.put(s2.charAt(0),1);

        for(int i=1;i<s1.length();i++){
            if(!hm1.containsKey(s1.charAt(i))){
                hm1.put(s1.charAt(i),1);
            }else{
                hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
            }
        }
        for(int i=1;i<s2.length();i++){
            if(!hm2.containsKey(s2.charAt(i))){
                hm2.put(s2.charAt(i),1);
            }else{
                hm2.put(s2.charAt(i),hm2.get(s2.charAt(i))+1);
            }
        }

        Boolean b=true;
        for(int i=0;i<s1.length();i++){
            if(hm1.get(s1.charAt(i))!=hm2.get(s1.charAt(i))){
                b=false;
                break;
            }
        }

        System.out.println(b);



        
    }
}
