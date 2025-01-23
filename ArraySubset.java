import java.util.*;

public class ArraySubset {
    public boolean isSubset(int[] arr1, int[] arr2) {
        // Write your code here
        HashSet<Integer> hs=new HashSet<>();
        for(int val:arr2){
            hs.add(val);
        }

        for(int val:arr1){
            if(!hs.contains(val)){
                return false;
            }
        }
        return true; // Placeholder return statement
    }

    public static void main(String[] args) {
        ArraySubset obj = new ArraySubset();
        
        // Example 1
        int[] arr1 = {1, 3, 4, 5, 2};
        int[] arr2 = {2, 4, 3, 1, 7, 5, 15};
        System.out.println(obj.isSubset(arr1, arr2)); // Expected Output: true

        // Example 2
        int[] arr1_2 = {1, 3, 4, 5, 2};
        int[] arr2_2 = {4, 5, 2};
        System.out.println(obj.isSubset(arr1_2, arr2_2)); // Expected Output: false

        // Example 3
        int[] arr1_3 = {1, 3, 4, 5, 2};
        int[] arr2_3 = {11, 12, 13, 15, 16};
        System.out.println(obj.isSubset(arr1_3, arr2_3)); // Expected Output: false
    }
}
 
