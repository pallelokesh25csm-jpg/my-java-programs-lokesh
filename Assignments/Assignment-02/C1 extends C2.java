class C2 {
    void display() {
        System.out.println("This is C2 class");
    }
}

class C1 extends C2 {
    void show() {
        System.out.println("This is C1 class");
    }
}

public class Main  {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.display();  // Method inherited from C2
        obj.show();     // Method of C1
    }
}