public class permutation {
    static void pm(String p,String up){
        if(up==""){
            System.err.println(p);
            return;
        }
            char ch=up.charAt(0);
        for(int i=0;i<=p;i++){
            char first=up.substring(0,i);
            char second=up.substring(i,p.length());
            pm(first+ch+second,up.substring(1));

        }
    }
    public static void main(String[] args) {
        String str="abc";
         pm("",str);
    }
}
