import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[]={2,4,1,3,5};
        int arr[]={2,5,1,7};
        Arrays.sort(arr);
        double median;
        if(arr.length%2==0){
            median=(  ((arr[arr.length/2]+arr[(arr.length/2)-1])/2.0));
        }else{
            median=(arr[arr.length/2]);
        }

        System.out.println(median);
    }
}
