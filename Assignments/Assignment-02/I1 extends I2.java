package myprogs;

interface I2{
     void add();
}
interface I1 extends I2{
    void add1();
}
class Show implements I1{
    @Override
    public void add() {
        System.out.println("I2 method");
    }

    @Override
    public void add1() {
System.out.println("I1 method");
    }
}

public class I1ExtI2 {
    public static void main(String[] args) {
Show s=new Show();
s.add();
s.add1();
    }
}