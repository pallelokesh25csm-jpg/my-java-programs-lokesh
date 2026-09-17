import java.util.Arrays;
import java.util.List;

public class UnsupportedExample {
    public static void main(String[] args) {
        try{
            List<Integer>list = Arrays.asList(10,20,30);
            list.add(40);
        }catch(UnsupportedOperationException e){
            System.out.println("operation is not supported");
        }
    }
}
