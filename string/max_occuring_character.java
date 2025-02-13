import java.util.HashMap;
import java.util.Scanner;

public class max_occuring_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put(s.charAt(0),1);
        for(int i=1;i<s.length();i++){
          if(!hm.containsKey(s.charAt(i))){
            hm.put(s.charAt(i),1);
          }else{
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
          }
        }

        StringBuilder sb=new StringBuilder();
        char ch=' ';
        int max=0;
        for(int i=0;i<s.length();i++){
            int currMax=hm.get(s.charAt(i));
            if(currMax>max){
                ch=s.charAt(i);
                max=currMax;
            }
        }

        System.out.println(ch+" occurs maximum time");
    }
}
