import java.util.*;
public class dl_findAnagram_of_String {
    static int makingAnagrams(String s1,String s2){
        List<Character> hs1 = new ArrayList<>();
        List<Character> hs2 = new ArrayList<>();
        int match = 0;

        for (char ch : s1.toCharArray()) {
            hs1.add(ch);
        }
        for (char ch : s2.toCharArray()) {
            hs2.add(ch);
        }

        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (hs2.contains(s1.charAt(i))) {
                    hs2.remove((Character) s1.charAt(i));
                    match = match + 2;
                }
            }
        } else if (s2.length() < s1.length()) {
            for (int i = 0; i < s2.length(); i++) {
                if (hs1.contains(s2.charAt(i))) {
                    hs1.remove((Character) s2.charAt(i));
                    match = match + 2;
                }
            }
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (hs2.contains(s1.charAt(i))) {
                    match = match + 2;
                    hs2.remove((Character) s1.charAt(i));
                }
            }
        }

        return (s1.length() + s2.length()) - match;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("enter two string");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        System.out.println(result);

        scanner.close();
    }
}
