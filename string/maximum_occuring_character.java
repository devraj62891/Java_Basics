import java.util.HashMap;
import java.util.Scanner;

public class maximum_occuring_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentencce");
        String s=sc.nextLine();
        String str[]=s.split(" ");
        int currMax=0;
        int finalMax=0;
        for(String val:str){
            String ch=val;
            HashMap<Character,Integer> hm=new HashMap<>();
            for(int i=0;i<val.length();i++){
                if(!hm.containsKey(val.charAt(i))){

                    hm.put(val.charAt(i),1);
                }else{
                    hm.put(val.charAt(i),hm.get(val.charAt(i))+1);
                }

                if(hm.get(val.charAt(i))>1){
                   currMax+=hm.get(val.charAt(i));
                }
                
            }


        }
    }
}
