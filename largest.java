import java.util.*;
public class largest{


    public static String findLargestWord(String s) {
        // Your code here
        int maxIndex=0;
        String arr[]=s.split(" ");
        String rString=arr[0];
        int curMaxLen=arr[0].length();
        for(String str:arr){
            if(str.length()>curMaxLen){
                curMaxLen=str.length();
                rString=str;
            }
        }
        return rString;
    }

    public static void main(String[] args) {
        // Example input
        String s1 = "Google Doc";
        String s2 = "Microsoft Teams";

        // Output results
        System.out.println(findLargestWord(s1)); // Expected output: "Google"
        System.out.println(findLargestWord(s2)); // Expected output: "Microsoft"
    
}

}
