// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if((n*n)%10==n%10){
            System.out.println("Automorphic no");
        }else{
            System.out.println("Not an automorphic no");
        }
    }
}
