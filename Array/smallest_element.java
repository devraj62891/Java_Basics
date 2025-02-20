import java.util.Scanner;

public class smallest_element{
    static int find(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int e:arr){
            min=Math.min(e, min);
        }

        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");{
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
        }

        int sm=find(arr);
        System.out.println(sm);
    }
}