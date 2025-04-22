 class Parent {
    void showMessage() {
        System.out.println("Hello from parent class");
    }
}

class Student extends Parent {
    void showMessage() {
        super.showMessage();
        System.out.println("HELLO FROM STUDENT CLASS");
    }
}

public class main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showMessage(); // Calls the overridden method in Student class
    }
}
