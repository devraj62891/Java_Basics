import java.util.Scanner;

public class sort_words {
    static String sort(String s){
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length-i-1;j++){
               if(ch[j]>ch[j+1]){
                char temp=ch[j];
                ch[j]=ch[j+1];
                ch[j+1]=temp;
               }
            }
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String s=sc.nextLine();
        String rs=sort(s);
        System.out.println(rs);
    }
}
