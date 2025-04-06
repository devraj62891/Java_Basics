public class number_series {
    static void print(int s,int e){
        if(s==e){
            System.err.println(e);
            return;
        }
        System.out.println(s);
        print(s+1,e);
        
    }
    public static void main(String[] args) {
        print(1,5);
    }
    
}
