public class remove_a {
    public static void main(String[] args) {
        String str="aabcd";
        String str2=remove(str,"");
        System.out.println(str2);
        System.out.println(skip(str));
    }

    static String remove(String str,String ans){
        if(str.length()==0){
            return ans;
        }

        char ch=str.charAt(0);
        if(ch=='a'){
           return remove(str.substring(1), ans);
        }else{
           return remove(str.substring(1), ans+ch);
        }

    }

    static String skip(String str){
        if(str==""){
            return "";
        }

        char ch=str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }else{
            return ch+skip(str.substring(1));
        }
    }
}
