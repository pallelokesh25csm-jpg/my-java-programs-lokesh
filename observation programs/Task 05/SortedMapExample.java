
import java.util.*;

class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> m = new TreeMap<>();

        m.put(30, "Ravi");
        m.put(10, "Lokesh");
        m.put(20, "Praveen");
        m.put(40, "Kiran");

        System.out.println("Sorted Map: " + m);
        System.out.println("First Key: " + m.firstKey());
        System.out.println("Last Key: " + m.lastKey());
        System.out.println("Head Map: " + m.headMap(30));
        System.out.println("Tail Map: " + m.tailMap(20));
        System.out.println("Sub Map: " + m.subMap(10, 30));
    }
}
