import java.util.Arrays;
public class Anagram_Check {

    public boolean isAnagram(String s, String t) {
        // Convert strings to character arrays
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare the sorted arrays by converting them back to strings
        return new String(ch1).equals(new String(ch2));
    }

    public static void main(String[] args) {
        Anagram_Check solution = new Anagram_Check();

        // Test cases
        String s1 = "listen";
        String t1 = "silent";
        System.out.println("Is Anagram: " + solution.isAnagram(s1, t1)); // Output: true

        String s2 = "triangle";
        String t2 = "integral";
        System.out.println("Is Anagram: " + solution.isAnagram(s2, t2)); // Output: true

        String s3 = "hello";
        String t3 = "world";
        System.out.println("Is Anagram: " + solution.isAnagram(s3, t3)); // Output: false
    
}

}
