interface I1 {
    void display1();
}

interface I2 {
    void display2();
}

class C1 implements I1, I2 {

    public void display1() {
        System.out.println("This is Interface I1");
    }

    public void display2() {
        System.out.println("This is Interface I2");
    }

    public static void main(String[] args) {
        C1 obj = new C1();

        obj.display1();
        obj.display2();
    }
}