import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenth of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;
            l--;
        }
        for(int e:arr){

            System.out.print(e+" ");
        }
    }
}
