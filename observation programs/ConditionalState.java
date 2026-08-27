import java .util.scanner;
public class ConditionalState{
public static void main(string[]args){
    scanner eo=new scanner (system.in);
    int n;
    system.out.println("enter the number");
    n=eo.nextInt();
    if (n %2 == 0){
        system.out.println("the number is even");
    }
    else{
        system.out.println("the number is odd");
    }
}
}