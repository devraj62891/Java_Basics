import java.util.Scanner;
public class largest {

    static int find(int arr[]){
        int min=Integer.MIN_VALUE;
        for(int e:arr){
            min=Math.max(e, min);
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

        int l=find(arr);
        System.out.println(l);
    }
}

