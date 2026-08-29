package record;
import java.util.Scanner;

interface I4{
    int y=45;
    void add();
}
class Demo {
    Scanner sc=new Scanner(System.in);
    int r;
    void diff(){
        System.out.println("enter the value of r :");
        r=sc.nextInt();
        System.out.println("the sum of two values is :"+(r+20));
         }
}

public class C1ImplC2ExtI1 extends Demo implements  I4{
    @Override
    public void add() {
        System.out.println("this is implements from interface");
    }

    public static void main(String[] args) {
        C1ImplC2ExtI1 re=new C1ImplC2ExtI1();
        re.add();
        re.diff();
    }
}