import java.util.*;
public class reverseString {
    static String rev(String arr[]){
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
           sb.append(arr[i]);
           if(i!=0){
            sb.append(" ");
           }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String revString=rev(arr);
        System.out.println(revString);

    }
}
