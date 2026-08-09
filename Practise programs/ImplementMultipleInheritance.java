
interface one{
    int x=100;

    void sample();

}
interface two extends one {
    int y=200;
    void demo();
    
}
class Multi implements one, two{




public void sample(){
    System.out.println("this is from interface one");
}
public void demo(){
    System.out.println("this is from interface two");
}
void MyMethod(){
    System.out.println("from child class");

}
}



public class ImplementMultipleInheritance {
 public static void main(String[] args) {
    multi mlt = new multi();
    System.out.println(one.x);
    System.out.println(two.x);
    mlt.demo();
    mlt.sample();
    mlt.mymethod();

 }    
}
