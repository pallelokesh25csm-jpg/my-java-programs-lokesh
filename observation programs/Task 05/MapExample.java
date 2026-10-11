
import java.util.*;

class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Lokesh");
        m.put(2, "Praveen");
        m.put(3, "Ravi");

        System.out.println("Map: " + m);
        System.out.println("Value: " + m.get(1));
        System.out.println("Has key 2: " + m.containsKey(2));
        System.out.println("Has value Ravi: "
                           + m.containsValue("Ravi"));

        m.remove(2);

        System.out.println("Keys: " + m.keySet());
        System.out.println("Values: " + m.values());
        System.out.println("Final Map: " + m);
        System.out.println("Size: " + m.size());
    }
}
