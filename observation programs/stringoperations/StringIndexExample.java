public class StringIndexExample {
   public static void main(String[] args) {
    try{
        String s = "Java";
        System.out.println(s.charAt(5));
    }catch(StringIndexOutOfBoundsException e){
        System.out.println("invalid string index");
    }
   } 
}
