import java.util.Scanner;

public class N_NaturalNo_Sum {
    static int find(int n){
        if(n==1){
            return 1;
        }
        return n+find(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for sum till n");
        int n=sc.nextInt();
        System.out.println(n*(n+1)/2);//normal method
        System.out.println("By recursion = "+find(n));
    }
}
