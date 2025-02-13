import java.util.HashMap;
import java.util.Scanner;

public class printDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put(s.charAt(0),1);
        for(int i=1;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1 );
            }else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }

        for(char ch:s.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch)>1){
                System.out.println(ch+"-"+hm.get(ch));
                hm.remove(ch);
            }
        }
    }
}
