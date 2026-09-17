public class ClassCastExample {
    public static void main(String[] args) {
        try{
            Object obj=Integer.valueOf(10);
            String s=(String) obj;
        }catch(ClassCastException e){
            System.out.println("Invalid typecasting");
        }
    }
}
