import java.util.HashSet;

public class subset {
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,2};
        int arr2[]={2,4,3,1,7,5,15};
        int i=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int e:arr2){
            hs.add(e);
        }
        for(int e:arr1){
            if(!hs.contains(e)){
                i=1;
                break;
            }
        }
        if(i==1){
            System.out.println("Not a subset");
        }else{
            System.out.println("yes it is subset");
        }
    }
}
