import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class smallest_And_second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> sm=new PriorityQueue<>();//smallest
        PriorityQueue<Integer> ssm=new PriorityQueue<>(Collections.reverseOrder());//larget
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(-1);
        }else{

            System.out.println("enter the elements of array");
            for(int i=0;i<n;i++){
                int e=sc.nextInt();
                if(!sm.contains(e)){
    
                    sm.add(e);
                    ssm.add(e);
                }
    
            }
            ssm.remove();
            System.out.println();
            System.out.println("second smallest "+ssm.remove());
            System.out.println("smallest "+sm.remove());
        }

    }
}
