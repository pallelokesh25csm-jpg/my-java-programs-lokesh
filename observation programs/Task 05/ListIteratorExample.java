
import java.util.*;

class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        ListIterator<String> it = list.listIterator();

        System.out.println("Forward Direction:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward Direction:");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        it.add("Orange");
        System.out.println("Final List: " + list);
    }
}
