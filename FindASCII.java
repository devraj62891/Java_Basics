import java.util.*;
import java.util.Scanner;

class FindASCII {
    public int getASCIIValue(char c) {
        // Implementation to be added
        return (int)c; // Placeholder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        FindASCII obj = new FindASCII();

        // Output section
        System.out.println("The ASCII value of '" + inputChar + "' is: " + obj.getASCIIValue(inputChar));

        scanner.close();
    }
}
