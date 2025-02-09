import java.util.Scanner;

public class ApSum {
    // Function to calculate sum of AP series
    static int sumOfAP(int a, int d, int n) {
        return (n * (2 * a + (n - 1) * d)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first term, common difference, and number of terms
        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        // Calculate sum
        int sum = sumOfAP(a, d, n);
        System.out.println("Sum of the AP series: " + sum);

        sc.close();
    }
}
