import java.util.Scanner;

public class Captilize_First_And_Last_Char {
    
    static String cap(String s){
        StringBuilder sb=new StringBuilder();
        if(s.length()==0 || s.length()==1){
            sb.append(Character.toUpperCase(s.charAt(0)));
        }else{

            String str[]=s.split(" ");
            for(String st:str){
                char ch[]=st.toCharArray();
                if(ch.length==1){
                    ch[0]=Character.toUpperCase(ch[0]);
                }else{
    
                    ch[0]=Character.toUpperCase(ch[0]);
                    ch[ch.length-1]=Character.toUpperCase(ch[ch.length-1]);
                }
                sb.append(new String(ch));
                sb.append(" ");
    
            }
        }
        String rs=sb.toString().trim();
        return rs;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a string");
         String s=sc.nextLine();
        String c=cap(s);
        System.out.println(c);
    }
}
