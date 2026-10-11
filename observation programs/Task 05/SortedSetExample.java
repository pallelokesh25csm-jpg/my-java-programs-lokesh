
import java.util.*;

class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();

        s.add(40);
        s.add(10);
        s.add(30);
        s.add(20);

        System.out.println("Sorted Set: " + s);
        System.out.println("First: " + s.first());
        System.out.println("Last: " + s.last());
        System.out.println("Head Set: " + s.headSet(30));
        System.out.println("Tail Set: " + s.tailSet(20));
        System.out.println("Sub Set: " + s.subSet(10, 30));
    }
}
