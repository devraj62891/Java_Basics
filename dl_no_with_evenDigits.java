
import java.util.*;

public class dl_no_with_evenDigits {
  
    public List<Integer> findNumbers(List<Integer> nums) {
        // To be implemented
        List<Integer> ls=new ArrayList<>();
        for(int val:nums){
            String s=Integer.toString(val);
            if(s.length()%2==0){
                ls.add(Integer.parseInt(s));
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        dl_no_with_evenDigits obj = new dl_no_with_evenDigits();
        // Example usage
        List<Integer> nums = Arrays.asList(123, 4567, 89, 1001, 22);

        List<Integer> result = obj.findNumbers(nums);
        System.out.println(result);
    }
}
