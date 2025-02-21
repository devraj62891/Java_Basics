import java.util.HashMap;
import java.util.Scanner;

public class symmetric_pairs {
    static void solve(int arr[][]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ar[]:arr){
            int first=ar[0];
            int last=ar[1];
            if(!hm.containsKey(last)){
                hm.put(first, last);
            }else{
                System.out.print("("+first+","+last+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1, 2},
        {2, 1},
        {3, 4},
        {4, 5},
        {5, 4}};

        solve(arr);
    }
}
