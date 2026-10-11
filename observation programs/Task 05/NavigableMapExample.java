
import java.util.*;

class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> m = new TreeMap<>();

        m.put(10, "A");
        m.put(20, "B");
        m.put(30, "C");
        m.put(40, "D");

        System.out.println("Map: " + m);
        System.out.println("Lower Key: " + m.lowerKey(30));
        System.out.println("Floor Key: " + m.floorKey(25));
        System.out.println("Ceiling Key: " + m.ceilingKey(25));
        System.out.println("Higher Key: " + m.higherKey(30));

        System.out.println("First Entry: " + m.firstEntry());
        System.out.println("Last Entry: " + m.lastEntry());
        System.out.println("Descending Map: " + m.descendingMap());

        System.out.println("Removed Entry: " + m.pollFirstEntry());
        System.out.println("Final Map: " + m);
    }
}
