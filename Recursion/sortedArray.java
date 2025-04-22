public class sortedArray {
    static boolean check(int[] arr,int n){
        if(n==0|| n==1){
            return true;
        }

        return arr[n-1]>=arr[n-2] && check(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,5};
        System.out.println(check(arr,arr.length));
    }
}
