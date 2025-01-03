import java.util.*;
public class changeCase {
    static String change(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){

                if(Character.isLowerCase(str.charAt(i))){
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }else{
                    sb.append(Character.toLowerCase(str.charAt(i)));
    
                }
            }else{
                sb.append(str.charAt(i));

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // String str=change("javA");
        String str=change("take u forward IS Awesome");
        System.out.println(str);
    }
}
