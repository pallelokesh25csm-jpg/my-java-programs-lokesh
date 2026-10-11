
import java.util.*;

class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> s = new TreeSet<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        System.out.println("Set: " + s);
        System.out.println("Lower 30: " + s.lower(30));
        System.out.println("Floor 25: " + s.floor(25));
        System.out.println("Ceiling 25: " + s.ceiling(25));
        System.out.println("Higher 30: " + s.higher(30));

        System.out.println("Descending: " + s.descendingSet());
        System.out.println("Removed first: " + s.pollFirst());
        System.out.println("Final Set: " + s);
    }
}
