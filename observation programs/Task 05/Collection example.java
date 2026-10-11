
import java.util.*;

class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        c.add(10);
        c.add(20);
        c.add(30);

        System.out.println("Collection: " + c);
        System.out.println("Contains 20: " + c.contains(20));
        System.out.println("Size: " + c.size());

        c.remove(10);
        System.out.println("After removal: " + c);

        c.clear();
        System.out.println("Is empty: " + c.isEmpty());
    }
}
