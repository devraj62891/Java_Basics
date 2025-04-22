import javax.print.DocFlavor.STRING;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}

interface MyWifi{
 String[] getNetworks();   
 void connectToNetwork(String network);
}


class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("connecting....");
    }

    

}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
   public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
       System.out.println("recording vdeo");
    };

    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList={"Devraj","Harry","Anjali"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}


public class default_methobds {
    public static void main(String[] args) {
     MySmartPhone ms=new MySmartPhone();
     String[] arr= ms.getNetworks();  
     
     for(String item:arr){
        System.out.println(item);

     }
    }
}
