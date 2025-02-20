import java.util.Scanner;

public class Rotate_by_k {
    static void reverse(int arr[],int si,int ei){
        while(si<=ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[]={1,2,3,4,5};
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        for(int e:arr){
            System.out.print(e+" ");
        }


    }
}
