import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicate {
    static void reverse(int arr[]){
        int i=0;int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,3,9,2,4,1,10,89,34};
        HashSet<Integer> hs=new HashSet<>();
        for(int e:arr){
            hs.add(e);
        }
        Stack<Integer> st=new Stack<>();
        for(int e:arr){
            if(hs.contains(e)){
                hs.remove(e);
                st.push(e);
            }
        }
        int rAr[]=new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            rAr[i]=st.pop();
            i++;
        }
        reverse(rAr);
        for(int e:rAr){
            System.out.print(e+" ");
        }
    }
}
