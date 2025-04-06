// Q3. An array is considered special if every pair of its adjacent elements contains two numbers with different parity. You are given an array of integers nums.

// Return true if nums is a special array, otherwise, return false.

// Example 1:

// Input: nums [1]

// Output: true

// Explanation: There is only one element. So, the answer is true.

// Example 2:

// Input: nums (2,1,4)

// Output: true

// Explanation: There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So, the answer is true.

// Example 3:

// Input: nums (4,3,1,6)

// Output: false

// Explanation: nums[1] and nums[2] are both odd. So, the answer is faise
import java.util.*;

public class specialARRAY {
    public static void main(String args[]) {
        int arr[] = { 4, 3, 1, 6 };
        boolean t = true;
        for (int i = 0; i < arr.length - 1; i++) {
            int f = arr[0];
            int s = arr[i + 1];
            if (f % 2 != s % 2) {
                t = false;
                break;
            }

        }
        System.out.print(t);

    }

}