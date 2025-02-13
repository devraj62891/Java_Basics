import java.util.Scanner;

public class find_substring_position {
    static int find(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<=l1-l2;i++){
            if(s1.substring(i, i+l2).equals(s2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        System.out.println("Enter the string that you want to find index of");
        String s2=sc.nextLine();
       System.out.println(find(s,s2)); 

    }
}
