public class averages {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={1,2,3,4,5};
        for(int e:arr){
            sum+=e;
        }
        System.out.println(sum/arr.length);
    }
}
