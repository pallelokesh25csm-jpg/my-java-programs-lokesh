public class ConDemo {
    int rollno;
    String name;
    float fee;

        
    public ConDemo(){
    this.rollno =1234;
    this.name ="lucky";
    this.fee =250.200f;
    System.out.println("exicuted");

}

void sample(int a){
int b;
b = 20;
System.out.println("sum is:"  +(a+b));

}
    public static void main(String[] args) {
        ConDemo cd=new ConDemo();
       
        System.out.println("rollno is:" + cd.rollno );
        System.out.println("name is :" + cd.name);
        System.out.println("fee is:" + cd.fee);
        cd.sample(20);
    }
}
