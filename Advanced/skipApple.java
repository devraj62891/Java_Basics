public class skipApple {
    static String skip(String s){
        if(s==""){
            return s;
        }
        if(s.startsWith("apple")){
            return skip(s.substring(5));
        }else{
            return s.charAt(0)+ skip(s.substring(1));
        }
    }
    public static void main(String[] args) {
        String s="dabapplebf";
        System.err.println(skip(s));
    }
}
