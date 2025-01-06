import java.util.HashMap;

class print_duplicate {
    public void printDuplicates(String str) {
      HashMap<Character,Integer> hm=new HashMap<>();
      hm.put(str.charAt(0),1);
      for(int i=1;i<str.length();i++){
        char ch=str.charAt(i);
        if(hm.containsKey(ch)){
            hm.put(ch,hm.get(ch)+1);
        }else{
            hm.put(ch,1);
        }
        
      }

      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(hm.containsKey(ch) && hm.get(ch)>1){
            System.out.println(ch+" - "+hm.get(ch));
            hm.remove(ch);
        }
      }
    }

    public static void main(String[] args) {
        print_duplicate sol = new print_duplicate();

        // Example 1
        String str1 = "sinstriiintng";
        sol.printDuplicates(str1);
        // Output:
        // i - 4
        // n - 3
        // s - 2
        // t - 2

        // Example 2
        String str2 = "abcdefg";
        sol.printDuplicates(str2);
        // Output:
        // < -- No Output -- >
    }
}
