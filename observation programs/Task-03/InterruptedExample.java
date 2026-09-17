public class InterruptedExample {
    public static void main(String[] args) {
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("thread was interrupted");
        }
    }
}
