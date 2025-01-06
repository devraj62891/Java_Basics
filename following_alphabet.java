import java.util.*;
public class following_alphabet {


    public static String shiftLetters(String str) {
        // Your code here
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            ch[i]=(char)(ch[i]+1);
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        // Example input
        String str1 = "abcdxyz";
        String str2 = "hello";

        // Output results
        System.out.println(shiftLetters(str1)); // Expected output: "bcdeyza"
        System.out.println(shiftLetters(str2)); // Expected output: "ifmmp"
    
}

}
