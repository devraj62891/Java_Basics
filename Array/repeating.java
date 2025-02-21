import java.util.HashMap;
import java.util.Scanner;

public class repeating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,0};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int e:arr){
         if(hm.containsKey(e)){
            hm.put(e,hm.get(e)+1);
         }else{
            hm.put(e,1);
         }
        }

        for(int e:arr){
            if(hm.containsKey(e) && hm.get(e)>1){
                System.out.print(e+" ");
                hm.remove(e);
            }
        }
    }
}