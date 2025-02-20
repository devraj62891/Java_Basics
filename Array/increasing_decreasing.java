import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class increasing_decreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenth of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        PriorityQueue<Integer> pq=new PriorityQueue<>();//increasing
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());//decreasing
        for(int i=0;i<n/2;i++){
            pq.add(arr[i]);
        }
        for(int i=(n/2);i<n;i++){
            pq2.add(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
        while(!pq2.isEmpty()){
            System.out.print(pq2.remove()+" ");
            
        }

    }
}
