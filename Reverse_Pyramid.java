public class Reverse_Pyramid {
    public static void main(String[] args) {
        int sp=0;
        int star=9;
        for(int i=1;i<=5;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            sp++;
           for(int k=0;k<star;k++){
                 System.out.print("*");
           }
           star--;
           star--;
           System.out.println();

        }
    }
}
