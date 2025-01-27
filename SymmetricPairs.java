import java.util.*;

public class SymmetricPairs {
    public void findSymmetricPairs(int[][] pairs) {
        // Write your code here

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int[] arr:pairs){
            int first=arr[0];
            int second=arr[1];
            if(!hm.containsKey(second)){
                hm.put(first,second);
            }else{
                System.out.print("("+first+","+second+")");
            }
        }
      
    }

    public static void main(String[] args) {
        SymmetricPairs obj = new SymmetricPairs();

        // Example 1
        int[][] pairs1 = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        
        // Example 2
        int[][] pairs2 = {{1, 5}, {2, 3}, {4, 2}, {5, 1}, {2, 4}};
        
        obj.findSymmetricPairs(pairs1);
        System.out.println();
        obj.findSymmetricPairs(pairs2);
        
    }
}
