public class example {
    public static void main(String[] args) {
     String s = "abc";

   try{
        int n=Integer.parseInt(s);
        System.out.println(n);
     }catch(NumberFormatException e){
        System.out.println("invalid number format");
     }
    } 
}
