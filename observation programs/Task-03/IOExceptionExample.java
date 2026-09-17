import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("abc.txt") ;
            f.close();
        }catch(IOException e){
            System.out.println("file operation failed");
        }
    }
}
