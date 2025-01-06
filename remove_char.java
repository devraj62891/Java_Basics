// Example 1:
// Input: String str1 = “abcdef”
//        String str2 = “cefz”
// Output: abd
// Explanation: The common characters in both strings are c, e, f.
// So after removing these characters from string 1 we get string resulting string as abd.


// Example 2:
// Input: String str1 = “xyzpw”
//        String str2 = “lmno”
// Output: xyzpw
// Explanation: As there is no common character in both the strings, string 1 remains unchanged.

import java.util.*;
class remove_char {
   public String removeCharacters(String str1, String str2) {

        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            hs.add(str2.charAt(i));
        }


        StringBuilder sb=new StringBuilder();
         for(int i=0;i<str1.length();i++){
              if(!hs.contains(str1.charAt(i))){
                sb.append(str1.charAt(i));
              }
         }
        return sb.toString();
       
    }

    public static void main(String[] args) {
       remove_char sol = new remove_char();

        // Example 1
        String str1 = "abcdef";
        String str2 = "cefz";
        System.out.println(sol.removeCharacters(str1, str2)); // Output: "abd"

        // Example 2
        str1 = "xyzpw";
        str2 = "lmno";
        System.out.println(sol.removeCharacters(str1, str2)); // Output: "xyzpw"
    }
}
