import java.util.Scanner;

public class sum_of_no_in_string {
    static int coun(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) ){
                // sum+=s.charAt(i)-'0'; 
                sum+=Character.getNumericValue(s.charAt(i));//* */
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entera  string");
        String s=sc.nextLine();
        int count=coun(s);
        System.out.println(count);
    }
}
