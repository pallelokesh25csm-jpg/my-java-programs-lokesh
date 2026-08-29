class a{
    int a=20;
    void sum(){
        System.out.println("sum is " +(a+22));

    }
}
class b extends a{
    int b=52;
    a add= new b();
    void sub(){
        System.out.println("subtraction is "+ (b-10));


    }
}   
public class SingleInheritance {

    public static void main(String[] args) {
        b oc = new b();
        System.out.println("variable can access is "+ (oc.a));
        System.out.println("can access"+ (oc.b));

        oc.sum();
        oc.sub();
    }
}

    


