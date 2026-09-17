public class ArrayIndexExample {
    public static void main(String[] args) {
        try{
            int a[]={10,20,30};
            System.out.println(a[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bounds");
        }
    }
}
