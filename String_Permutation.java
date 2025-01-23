import java.util.*;
public class String_Permutation {
    static void findPermutation(String s,String permutaion){
        if(s.length()==0){
            System.out.println(permutaion);
        }
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            String newStr=s.substring(0, i)+s.substring(i+1);
            findPermutation(newStr, permutaion+currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a valid string");
        String s=sc.nextLine();

        findPermutation(s,"");
    }
    
}
