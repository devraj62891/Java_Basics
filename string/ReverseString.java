import java.util.Scanner;

public class ReverseString {
    static String find(String s){
        StringBuilder sb=new StringBuilder();
        char arr[]=s.toCharArray();
        int f=0;
        int l=arr.length-1;
        while(f<l){
            char temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            l--;
            f++;
        }

        return (new String(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String rs=find(s);
        System.out.println(rs);
    }
}
