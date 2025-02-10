public class StrongNo {
    static int fact(int n){
        if(n==1 || n==0){
            return n;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // int n=145;
        int n=26;
        int temp=n;
        int sum=0;
        while(n>0){
            int d=fact(n%10);
            sum+=d;
            n=n/10;
        }
     if(temp==sum){
        System.out.println("Strong number");
     }else{
        System.out.println("Not a strong no.");
     }

        
    }
}
