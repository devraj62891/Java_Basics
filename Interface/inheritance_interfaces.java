interface sampleInterface{
    void meth1();
    void meth2();
}

interface chileSampleInterface extends sampleInterface{
    
    void meth3();
    void meth4();

}

class MySampleClass implements chileSampleInterface{
    void meth3(){
        System.out.println("meth 3");
    }

    void meth4(){
        System.out.println("meth4");
    }
}

public class inheritance_interfaces {
    public static void main(String[] args) {
        
    }
}
