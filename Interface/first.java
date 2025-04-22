
interface Bicycle{
    int a=40;
 void applyBrake(int decrement);
 void speedUp(int increment);
}

interface HornBycle{
    int a=40;
    void blowHornKg();
    void blowHornKb();
}

class AvonCycle implements Bicycle,HornBycle{
    void blowHorn(){
        System.err.println("pee pee po po");
    }

    public void applyBrake(int decrement){
        System.err.println("Applying brake");
    }

    public void speedUp(int increment){
        System.err.println("Applying speed up");
    }

    public void blowHornKb(){
        System.err.println("kgf horn");

    }
    public void blowHornKg(){
        System.out.println("kabhi khusi kabhi gam");
    }
}




public class first {

    public static void main(String[] args) {
        AvonCycle cycleHarry=new AvonCycle();
        cycleHarry.applyBrake(1);
       
    }
}