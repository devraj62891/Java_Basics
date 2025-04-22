public class pattern {
    static void printt(int r,int c){
        if(r==0){
            return;
        }

        if(r>c){
            System.out.print("*");
            printt(r, c+1);
        }
       if(r==c){
        System.err.println();
        printt(r-1, 0);
       }
    }
    public static void main(String[] args) {
        printt(4,0);
    }
}
