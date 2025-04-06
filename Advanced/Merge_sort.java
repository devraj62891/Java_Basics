import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[]={4,5,7,8,2,9};
        arr=ms(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int first[],int[] second){
        int temp[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                temp[k]=first[i];
                i++;
            }else{
                temp[k]=second[j];
                j++;
            }
            k++;
        }

        //left out from first
        while(i<first.length){
            temp[k]=first[i];
            k++;
            i++;
        }

        while(j<second.length){
            temp[k]=second[j];j++;
            k++;
        }

        return temp;

    }
    static int[] ms(int arr[]){
        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=ms(Arrays.copyOfRange(arr, 0, mid));
       int[] right= ms(Arrays.copyOfRange(arr, mid, arr.length));
        

       return merge(left,right);


    }
}
