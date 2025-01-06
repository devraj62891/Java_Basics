
import java.util.*;
class MaxOcrCharacter {
    public char getMaxOccurringChar(String str) {
       HashMap<Character,Integer> hm=new HashMap<>();
       hm.put(str.charAt(0),1);
       for(int i=1;i<str.length();i++){
        char ch=str.charAt(i);
         if(hm.containsKey(ch)){
          hm.put(ch,hm.get(ch)+1);
         }else{
            hm.put(ch,1);
         }
       }

       int max=0;
       char ch='a';
       for(int i=0;i<str.length();i++){
        if(hm.get(str.charAt(i))>max){
            max=hm.get(str.charAt(i));
                  ch=str.charAt(i);
        }
       }

       return ch;

    }

    public static void main(String[] args) {
        MaxOcrCharacter maxChar = new MaxOcrCharacter();

        // Example 1
        String str1 = "takeuforward";
        System.out.println(maxChar.getMaxOccurringChar(str1)); // Expected Output: 'a' or 'r'

        // Example 2
        String str2 = "apple";
        System.out.println(maxChar.getMaxOccurringChar(str2)); // Expected Output: 'p'
    }
}
