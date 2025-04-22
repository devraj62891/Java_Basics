

public class BinarySearch {
    static int BS(int arr[],int target,int si,int ei){
       if(si>ei){
        return -1;
       }

       int mid=si+(ei-si)/2;
       if(target==arr[mid]){
        return mid;
       }
       if(target>arr[mid]){
        return BS(arr, target, mid+1, ei);
       }
       return BS(arr, target, si, mid);

    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,8,9};
        int target=6;
        System.err.println(BS(arr,target,0,arr.length-1));
    }
}
