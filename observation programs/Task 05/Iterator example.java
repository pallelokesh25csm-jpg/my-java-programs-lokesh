
import java.util.*;

class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();

        System.out.println("Elements:");

        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);

            if (n == 20) {
                it.remove();
            }
        }

        System.out.println("After removal: " + list);
    }
}
