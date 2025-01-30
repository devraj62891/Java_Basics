//searching in a sorted matrix

import java.util.*;

public class SearchInMatrix {
    static int[] search(int arr[][],int target){

        int r=0;
        int c=arr.length-1;
         while(r<arr.length && c>=0){
            if(target>arr[r][c]){
                r++;
            }else if(target<arr[r][c]){
                c--;
            }else if(target==arr[r][c]){
                return new int[]{r,c};
            }
         }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[][]={
              {10,20,30},
              {20,25,40},
              {30,60,80}
        };
        System.out.println(Arrays.toString(SearchInMatrix.search(arr, 20)));
    }
}
