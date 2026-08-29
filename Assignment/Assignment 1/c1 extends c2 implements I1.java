interface I1 {
    void displayInterface();
}

class C2 {
    void displayC2() {
        System.out.println("This is class C2");
    }
}

class C1 extends C2 implements I1 {
    
    public void displayInterface() {
        System.out.println("This is interface I1");
    }

    void displayC1() {
        System.out.println("This is class C1");
    }
}

public class Main {
    public static void main(String[] args) {
        
        C1 obj = new C1();

        obj.displayC2();        
        obj.displayC1();        
        obj.displayInterface(); 
    }
}
