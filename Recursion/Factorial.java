public class Factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }

        int temp=fact(n-1);
        return n*temp;
    }
    public static void main(String[] args) {
        int n=fact(5);
        System.out.println(n);
    }
}
