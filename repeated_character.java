import java.util.*;

class repeated_character {
    static void findHighestRepeatedLetters(String str) {
        String[] words = str.split(" "); // Split the string into words
        String result = "-1"; // Default result if no word has repeated letters
        int maxRepeats = 0; // Maximum number of repeated letters

        for (String word : words) {
            int[] frequency = new int[26]; // Array to store letter frequency
            int currentMax = 0;

            // Count letter frequencies
            for (char c : word.toCharArray()) {
                frequency[c - 'a']++;
            }

            // Check for repeated letters
            for (int count : frequency) {
                if (count > 1) {
                    currentMax++; // Count the number of letters that repeat
                }
            }

            // Update result if this word has more repeated letters
            if (currentMax > maxRepeats) {
                maxRepeats = currentMax;
                result = word;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String str = "abcdefg google microsoft";
        findHighestRepeatedLetters(str);
    }
}
