import java.util.HashMap;
import java.util.Scanner;

public class count_freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenth of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int e:arr){
        if(hm.containsKey(e)){
            hm.put(e,hm.get(e)+1);
        }else{
            hm.put(e,1);
        }
      }

      for(int e:arr){
        if(hm.containsKey(e)){
            System.out.println(e+" "+hm.get(e));
            hm.remove(e);
        }
      }
    }
}
