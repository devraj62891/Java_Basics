import java.util.HashSet;

public class equilibrium {
    static int brute(int arr[]){
        if(arr.length==1){
            return 0;
        }
        if(arr.length==2){
            return -1;
        }
        int ls=arr[0];
        int rs=0;
        for(int i=1;i<arr.length;i++){
              ls+=arr[i];
              int ri=i+2;
              while(ri<arr.length){
                rs+=arr[ri++];
              }

              if(ls==rs){
                return i+1;
                
              }else{
                rs=0;
              }
        }
        return -1;
    }
    public static void main(String[] args) {
        //brute force
        int arr[]={1,-1,4};
        int bt=brute(arr);
        System.out.println(bt+" is the equilibrium index by brute force");
    }
}
