import java.util.*;

class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C");

        System.out.println("Hashtable: " + table);

        System.out.println("Get key 2: " + table.get(2));

        table.remove(3);

        System.out.println("Contains key 1: " + table.containsKey(1));
        System.out.println("Contains value Java: " +
                           table.containsValue("Java"));

        System.out.println("Keys: " + table.keys());
        System.out.println("Elements: " + table.elements());

        System.out.println("Size: " + table.size());
        System.out.println("Is Empty: " + table.isEmpty());
    }
}