
// Example 1:
// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

import java.util.Arrays;
import java.util.HashMap;

public class rankFind {
    public static void main(String[] args) {
        int arr[]={20, 15 ,26 ,2 ,98 ,6};
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            hm.put(arr2[i], i+1);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    
}
