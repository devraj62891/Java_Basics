public class SubstringPosition {
   
    public static int findSubstringPosition(String s1, String s2) {
        // Your implementation here
        if(s2.length()>s1.length()){
            return -1;
        }
        for(int i=0;i<=s1.length()-s2.length();i++){//insures no out of bound
            if(s1.charAt(i)==s2.charAt(0)){
                if(((s1.substring(i, i+s2.length())).equals(s2))){
           return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String text = "takeuforward";
        String pattern = "forward";

        // Function call
        int result = findSubstringPosition(text, pattern);
        System.out.println(result);
    }
}
