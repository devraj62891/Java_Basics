import java.util.Scanner;

public class next_lexicographic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='z'){
                ch[i]='a';
            }else if(ch[i]=='Z'){
                ch[i]='A';
            }
            else{

                ch[i]=(char)(ch[i]+1);
            }
        }
     System.out.println(new String(ch));

    }
}
